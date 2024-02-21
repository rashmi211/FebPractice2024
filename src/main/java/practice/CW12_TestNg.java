package practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CW12_TestNg {
	
	@BeforeTest
	public void beforeTestMethod() {
		System.out.println("Invoked before testing starts");
	}
	
	@BeforeClass
	public void beforeClassMethod() {
		System.out.println("Invoked before class execution");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("called before each test method");
	}
	
	
	@Test
	public void test() {
		System.out.println("First test case");
	}
	
	@Parameters({"a","b"})
	@Test
	public void test2(int i,int j) {
		System.out.println("Sum of these two number is "+(i+j));
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("called after each test method");
	}
	
	@AfterClass
	public void afterClassMethod() {
		System.out.println("Invoked after class execution");
	}
	
	@AfterTest
	public void afterTestMethod() {
		System.out.println("Invoked after testing over");
	}
}
