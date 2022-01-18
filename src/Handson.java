import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Handson {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(new File("student.txt"));
		List<String> students = new ArrayList<String>();
		
		while(scanner.hasNextLine()) {
			students.add(scanner.nextLine());
		}
		
		for(int i=0;i<students.size();i++) {
			System.out.println("Name: "+ students.get(i));
		}
		
		scanner.close();



	}

}
