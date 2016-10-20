package TestRuns;
import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

public class RunFailedTc {

	public static void main(String[]arg){
		
		TestNG runner=new TestNG();
		
		List<String> list=new ArrayList<String>();
		list.add("C:\\Users\\sharvari.bhosale\\Sample workspace\\MySampleWork\\test-output\\Default suite\\testng-failed.xml");
		runner.setTestSuites(list);
		runner.run();
	}

}
