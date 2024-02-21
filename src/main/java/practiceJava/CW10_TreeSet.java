package practiceJava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class CW10_TreeSet {
	public static void main(String[] args) {
	TreeSet al=new TreeSet();
	al.add(100);
	al.add(350);
	al.add(40);
	al.add(15);
	al.add(120);
	al.add(500);
	
	System.out.println(al);//print in ascending order
	
	al.pollFirst();//delete first element 
	System.out.println(al);

	al.pollLast();//delete last element
	
	System.out.println(al.first());
	
	System.out.println("print in decending order");
	
	Iterator itr=al.descendingIterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
}
}
