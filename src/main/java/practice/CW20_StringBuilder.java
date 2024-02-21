package practice;

public class CW20_StringBuilder {
	public static void main(String[] args) {
		String s="Rashmi Salunke";
		StringBuffer sb=new StringBuffer(s);
		System.out.println(sb.length());
		
//		sb.append(" is an automation tester");
//		System.out.println(sb);
//		
//		System.out.println(sb.capacity());
//		System.out.println(sb.charAt(2));
//		
//		System.out.println(sb.deleteCharAt(32));
		
		System.out.println(sb.reverse());
		
		sb.setCharAt(0, 's');
		System.out.println(sb);
		
		StringBuilder sbu=new StringBuilder("ShrutiSaluke");
		System.out.println(sbu.reverse());
		
		
		
	}

}
