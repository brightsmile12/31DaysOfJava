import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Handson {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		LinkedList<String> names = new LinkedList<String>();
		names.push("Sam");
		names.push("Kwon");
		names.push("Bolden");
		System.out.println(names.pop());
		System.out.println(names.remove());
		System.out.println(names.removeFirst());

	}

}
