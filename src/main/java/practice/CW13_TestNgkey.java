package practice;

import org.testng.annotations.Test;

public class CW13_TestNgkey {
	
	@Test(priority=1)
	public void test1() {
		System.out.println("Method1");
	}

	@Test(priority=2)
	public void test2() {
		System.out.println("Method2");
	}

	@Test(invocationCount=2)
	public void test3() {
		System.out.println("Method3");
	}

	@Test(enabled=false)
	public void test4() {
		System.out.println("Method4");
	}

	@Test(timeOut=3000,priority=5)
	public void test5() throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("Method5");
	}

	@Test(dependsOnMethods="test1")
	public void test6() {
		System.out.println("Method5");
	}

}
