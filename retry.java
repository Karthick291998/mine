package parallel;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class retry implements IRetryAnalyzer{

	int i=0;
	int j=1;
	public boolean retry(ITestResult result) {
		if(i<j)
		{
			i++;
			return true;	
		}
		else
		{
		return false;
		}
	}

}
