package org.rerun;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryFailedTestCases implements IRetryAnalyzer{
	int retryCount = 0, maxCount=3;

	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		
		
		
		if(retryCount<maxCount) {
			
			System.out.println("Retrying "+result.getName()+" and the count is "+ retryCount+1);
			retryCount++;
			return true;
		}
		
		return false;
	}

}
