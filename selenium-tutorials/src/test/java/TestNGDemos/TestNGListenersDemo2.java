package TestNGDemos;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestNGDemos.TestNGListeners.class)
public class TestNGListenersDemo2 {

	@Test
	public static void test4() {
		System.out.println("I am inside test4");
	}

	@Test
	public static void test5() {
		System.out.println("I am inside test5");
	}
	
	@Test
	public static void test6() {
		System.out.println("I am inside test6");
		throw new SkipException("This test was skipped");
	}
}
