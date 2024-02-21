package practiceJava;

import java.util.ArrayList;

public class CW_Array {
	public static void main(String[] args) {
		int n[]= {10,20,4,56,32,5};
		ArrayList al=new ArrayList();
		for(int i=0; i<n.length; i++) {
			al.add(n[i]);
		}
		System.out.println(al);
	}

}
