package org.groups;

import org.testng.annotations.Test;

public class GroupTest {

	@Test(groups = "smoke")
	private void classA() {
		System.out.println("This is class A");

	}

	@Test(groups = {"sanity", "regression"})
	private void classB() {
		System.out.println("This is class B");
	}

	@Test(groups = "smoke")
	private void classC() {
		System.out.println("This is class C");

	}

}
