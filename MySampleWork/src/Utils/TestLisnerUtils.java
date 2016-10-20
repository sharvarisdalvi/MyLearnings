package Utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestLisnerUtils implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("onTestStart testcase  testmethod name"+result.getName());
		System.out.println(" onTestStart test name"+result.getTestName());
		System.out.println(" onTestStart time when test satrted test name"+result.getStartMillis());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("ontest success Testcasepaaswd "+result.getName());
		System.out.println(" ontest success test name"+result.getTestName());
		 File sb=	FileFolderCreationUtils.folderCreation("Pass");
			
			//String ds=	System.getProperty("user.dir")+"\\TestResultScreenShot\\fail\\"+result.getName()+".png";
			String ds=	sb+"\\"+result.getName()+".png";
			System.out.println("screenshaot name=="+ds);
			File destfile = new File(ds);
			try {
				WebDriverUtils.captureScreenOnTestFailure(destfile);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("ontest failure Testcasepaaswd "+result.getName());
		System.out.println(" ontest failure test name"+result.getTestName());
	
	  File sb=	FileFolderCreationUtils.folderCreation("Fail");
				
			//String ds=	System.getProperty("user.dir")+"\\TestResultScreenShot\\fail\\"+result.getName()+".png";
			String ds=	sb+"\\"+result.getName()+".png";
			System.out.println("screenshaot name=="+ds);
			File destfile = new File(ds);
			try {
				WebDriverUtils.captureScreenOnTestFailure(destfile);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println(" skippedtest name"+result.getTestName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		//context.
		System.out.println("select suite name=="+context.getSuite());
		System.out.println("select test name=="+context.getName());
		System.out.println("select host name=="+context.getHost());
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("displayed all methods which were run name=="+context.getAllTestMethods());
		System.out.println("displayed all failded mee=="+context.getFailedTests());
		
	}

}
