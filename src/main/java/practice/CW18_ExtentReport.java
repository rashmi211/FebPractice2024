package practice;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class CW18_ExtentReport {
	public static ExtentReports createReport() {
	ExtentSparkReporter report=new ExtentSparkReporter("newreport.html");
	ExtentReports rp=new ExtentReports();
	rp.attachReporter(report);
	rp.setSystemInfo("TestType", "Regression");
	rp.setSystemInfo("Date", "20th Feb 2024");
	rp.setSystemInfo("QA Engineer", "Rashmi Salunke");
	rp.setSystemInfo("Approved By", "Subodh Patil");
	
	return rp;//we have to call non static method of ExtentReports so we return its ref of object
	}
}
