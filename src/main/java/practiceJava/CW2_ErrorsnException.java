package practiceJava;

import java.util.Scanner;

public class CW2_ErrorsnException {
	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		
//		int a=sc.nextInt();
//		int b=sc.nextInt();
//		
//		
//		try{
//			System.out.println(a/b);
//		}
//		
//		catch(Exception e) {
//			System.out.println("You can not divide number with 0");
//			e.printStackTrace();
//		}
//		finally{
//			System.out.println(a/b);
//		}
		
		String name="123";
		
		try {
			int n=Integer.parseInt(name);	
			System.out.println(n);
		}
		catch(Exception e) {
			System.out.println("String not converting to integer");
		}
		
//		String name2=String.valueOf(n);
//		
//		String name3=Integer.toString(n);	
	}
}
