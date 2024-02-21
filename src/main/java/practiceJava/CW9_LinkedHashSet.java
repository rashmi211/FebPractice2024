package practiceJava;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class CW9_LinkedHashSet {
	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		al.add("Rashmi");
		al.add(null);
		al.add('c');
		al.add(120);
		al.add(10.5f);
		al.add('c');
		al.add("Rashmi");
		al.add(null);
		al.add('c');
		al.add(120);
		al.add(10.5f);
		al.add('c');
		
		
		
		LinkedHashSet hs=new LinkedHashSet(al);
	
		
//		System.out.println(hs);
//		System.out.println(hs.contains(120));
//	
//		System.out.println(hs.remove(null));
		
		System.out.println("-----print with iterator-----");
		Iterator itr=hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("-----print with for each loop-----");
		for(Object o:hs) {
			System.out.println(o);
		}
	}
}
