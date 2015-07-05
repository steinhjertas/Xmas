package no.stein.xmas.day8;

import org.junit.Test;

public class DivisorListTest {
	@Test
	public void test_divisor_list_for_6() throws Exception {
		doOperation(6);
	}
	@Test
	public void test_divisor_list_for_8() throws Exception {
		doOperation(8);
	}
	@Test
	public void test_divisor_list_for_9() throws Exception {
		doOperation(9);
	}
	@Test
	public void test_divisor_list_for_16() throws Exception {
		doOperation(16);
	}
	@Test
	public void test_divisor_list_for_28() throws Exception {
		doOperation(28);
	}
	@Test
	public void test_divisor_list_for_496() throws Exception {
		doOperation(496);
	}
	@Test
	public void test_divisor_list_for_8146() throws Exception {
		doOperation(8148);
	}

	private void doOperation(int number) {
		DivisorList list = new DivisorList(number);
		System.out.println(number +": \t"+list.getDivisors() + ", sum: "+ list.sum());
	}
}
