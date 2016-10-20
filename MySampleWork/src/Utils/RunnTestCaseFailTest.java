package Utils;

import java.util.ArrayList;

import org.testng.TestNG;

public class RunnTestCaseFailTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestNG runner= new TestNG();
		ArrayList<String> list= new ArrayList<String>();
		list.add("C:\\Users\\bajarangi.chaurasia\\workspace\\testarct\\test-output\\SmokeSuite\\testng-failed.xml");
		runner.setTestSuites(list);
		runner.run();

	}

}
