package practice;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class CW16_ListenersDemo extends CW17_BaseClass implements ITestListener{
	
	public void onTestStart(ITestResult result) {
		System.out.println(result.getName()+" Test has started");
	}
	
	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName()+" Test has passed");
	}
	
	public void onTestFailure(ITestResult result) {
		System.out.println(result.getName()+" Test has failed");
		try {
			CW2_Screenshot.pictiure(result.getName(),driver);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void onTestSkipped(ITestResult result) {
		System.out.println(result.getName()+" Test has skipped");
	}

}
