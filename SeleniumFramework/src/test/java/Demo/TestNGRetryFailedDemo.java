package Demo;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class TestNGRetryFailedDemo {
	
	@Test
	public void Test1() {
		System.out.println("I am inside Test 1");
	}
	
	@Test
	public void Test2() {
		System.out.println("I am inside Test 2");
		//int i=1/0;	
	}
	
	@Test(retryAnalyzer = listeners.RetryAnalyzer.class)
	public void Test3() {
		System.out.println("I am inside Test 3");
		Assert.assertTrue(0>1);
	}
	
	
}
