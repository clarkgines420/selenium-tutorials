package TestNGDemos;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestNGDemos.TestNGListeners.class)
public class TestNGListenersDemo {

	@Test
	public static void test1() {
		System.out.println("I am inside test1");
	}

	@Test
	public static void test2() {
		System.out.println("I am inside test2");
		Assert.assertTrue(false);
	}
	
	@Test
	public static void test3() {
		System.out.println("I am inside test3");
		throw new SkipException("This test was skipped");
	}
}
