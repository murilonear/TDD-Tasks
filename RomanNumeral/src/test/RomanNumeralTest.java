package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RomanNumeralTest {
	RomanNumeral converter;

	@Before
	public void init() {
		converter = new RomanNumeral();
	}

	@Test
	public void test_1() {
		converter.setNumber("I");
		int actual = converter.isComplete();
		int expected = 1;
		assertEquals(expected,actual);
	}
	
	@Test
	public void test_5() {
		converter.setNumber("V");
		int actual = converter.isComplete();
		int expected = 5;
		assertEquals(expected,actual);
	}
	
	@Test
	public void test_10() {
		converter.setNumber("X");
		int actual = converter.isComplete();
		int expected = 10;
		assertEquals(expected,actual);
	}
	
	@Test
	public void test_50() {
		converter.setNumber("L");
		int actual = converter.isComplete();
		int expected = 50;
		assertEquals(expected,actual);
	}
	
	@Test
	public void test_100() {
		converter.setNumber("C");
		int actual = converter.isComplete();
		int expected = 100;
		assertEquals(expected,actual);
	}
	
	@Test
	public void test_500() {
		converter.setNumber("D");
		int actual = converter.isComplete();
		int expected = 500;
		assertEquals(expected,actual);
	}
	
	@Test
	public void test_1000() {
		converter.setNumber("M");
		int actual = converter.isComplete();
		int expected = 1000;
		assertEquals(expected,actual);
	}

}
