package Demo;

import org.testng.annotations.Test;

public class TestNGPriorityDemo
{
	@Test(priority=1)
	public void one()
	{
		System.out.println("I am inside Test1");
	}
	@Test
	public void two()
	{
		System.out.println("I am inside Test2");
	}
	@Test
	public void three()
	{
		System.out.println("I am inside Test3");
	}
	
}
