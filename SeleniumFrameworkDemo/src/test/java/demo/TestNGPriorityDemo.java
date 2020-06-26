package demo;

import org.testng.annotations.Test;

public class TestNGPriorityDemo {
	@Test(priority=3)
	public void one() {
		System.out.println("I am inside one");
	}
	@Test(priority=5)
	public void two() {
		System.out.println("I am inside two");
	}
	@Test(priority=1)
	public void three() {
		System.out.println("I am inside three");
	}

}
