package practiceJava;

import java.util.HashSet;
import java.util.Iterator;

public class CW8_Set {
	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add("Rashmi");
		hs.add(null);
		hs.add('c');
		hs.add(120);
		hs.add(10.5f);
		hs.add('c');
		
		System.out.println(hs);
		System.out.println(hs.contains(120));
	
		System.out.println(hs.remove(null));
		
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
