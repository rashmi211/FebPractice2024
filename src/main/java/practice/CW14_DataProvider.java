package practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CW14_DataProvider {
	
	
	@DataProvider(name="Adata",indices= {0,2})
	public String[] data() {
	String s[]=new String[]{"Rashmi","Shruti","Ram","Sham"};
		return s;
	}
	
	@DataProvider(name="Bdata")
	public Object[][] data1() {
		Object[][] ob=new Object[][] {{1,"Rashmi"},{2,"Shruti"},{3,"Maya"}};
		return ob;
	}
	
	@Test(dataProvider="Adata")
	public void methodA(String name) {
		System.out.println(name);
	}
	
	@Test(dataProvider="Bdata")//Here we have specified parameter directly
	public void methodB(int rollnum,String name) {
		System.out.println(rollnum+" "+name);
	}
	
	@DataProvider(name="Cdata")
	public Object[] data2() {
		Object[] ob=new Object[] {"Rashmi",1,"Maya"};
		return ob;
	}
	
	
	@DataProvider(name="Ddata")
	public Object[][] data3() {
		Object[][] ob=new Object[][] {{1,"Rashmi"},{2,"Shruti"},{3,"Maya"}};
		return ob;
	}
	
	@Test(dataProvider="Ddata") //we have used single di array when we n number of data
	public void methodc(Object[]o) {
		System.out.println(o[0]+""+o[1]);
	}
}
