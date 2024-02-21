package practiceJava;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class CW6_Vector {
public static void main(String[] args) {
		
		Vector al=new Vector();
		al.add("Rashmi");
		al.add(null);
		al.add('s');
		al.add(10.5f);
		al.add(false);
		al.add("Rashmi");
		al.add(100);
		
		System.out.println(al);
		System.out.println(al.contains("Rashmi"));
		System.out.println(al.get(5));
		al.add(6, 'a');//ADDIG IN BETWEEN
		al.set(5, "Shruti");
		System.out.println(al);
		
		
		al.remove(5);
		System.out.println(al);
		
		System.out.println(al.indexOf("Rashmi"));
		
		
		System.out.println("-----print with iterator-----");
		Iterator itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("-----print with Listiterator-----");
		ListIterator ltr=al.listIterator();
		while(ltr.hasNext()) {
			System.out.println(ltr.next());
		}
		
		System.out.println("-----print with for loop-----");
		for(int i=0; i<al.size(); i++) {
			System.out.println(al.get(i));
		}
		
		System.out.println("-----print with for each loop-----");
		for(Object o:al) {
			System.out.println(o);
		}
		
		System.out.println("-----print with for enumeration loop-----");
		
		Enumeration en=al.elements();
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
		
		
		
	}

}
