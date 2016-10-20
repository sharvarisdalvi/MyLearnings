 package Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class LISTNER implements ITestListener {

	@Override
	public void onFinish(ITestContext arg0) {
		System.out.println("Test execution finished");
		
	}

	@Override
	public void onStart(ITestContext arg0) {
		
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test failed "+result.getName());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test skipped"+result.getName());
		
	}

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test execution started"+result.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		System.out.println("Test execution successful");
		
	}
	
}
