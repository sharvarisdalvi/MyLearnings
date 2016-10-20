package Listeners;

import org.testng.Assert;
import org.testng.annotations.Test;

public class impleRetry {
	
	@Test(retryAnalyzer=Retry.class)
	public void failtc()
	{
		Assert.fail();
		
	}

	public void alwaysPass()
	{
		System.out.println("This test should pass");
	}
}
