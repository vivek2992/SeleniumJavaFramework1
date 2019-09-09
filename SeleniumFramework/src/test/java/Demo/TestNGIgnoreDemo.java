package Demo;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;


public class TestNGIgnoreDemo {
	
	@Ignore
	@Test
	
	public void Test1() {
		System.out.println("I am Inside Test 1");		
	}
	
	@Test
	public void Test2() {
		System.out.println("I am Inside Test 2");		
	}
	
}
