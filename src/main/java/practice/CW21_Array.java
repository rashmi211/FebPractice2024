package practice;

public class CW21_Array {
	public static void main(String[] args) {
		int n[][]= {{10,20,30,40},{50,60}};
		for(int i=0; i<n.length; i++) {
			for(int j=0; j<n[i].length; j++) {
				System.out.print(n[i][j]+",");
			}
			System.out.println();
		}
		
	}

}
