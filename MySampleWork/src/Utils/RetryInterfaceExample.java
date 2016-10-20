package Utils;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryInterfaceExample implements IRetryAnalyzer {

private int count=0;
private int maxcount=4;

	

	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		

		if(count<maxcount)
		{
			count++;
			return true;
		}
		return false;
	}

}
