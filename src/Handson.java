import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Handson {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		LinkedList<String> names = new LinkedList<String>();
		names.push("Sam");
		names.push("Kwon");
		names.push("Bolden");

		
		ListIterator<String> it = names.listIterator();
		it.next();
		it.add("Baller");

		for(String dummy: names) {
			System.out.println(dummy);
		}

	}

}
