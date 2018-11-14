package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import code.LeapYear;

public class LeapYearTest {

	LeapYear leap;

	@Before
	public void init() {
		leap = new LeapYear();
	}

	@Test
	public void test_1996() {
		leap.setYear(1996);
		boolean actual = leap.isLeapYear();
		boolean expected = true;
		assertEquals(expected, actual);
	}

	@Test
	public void test_2004() {
		
		leap.setYear(2004);
		boolean actual = leap.isLeapYear();
		boolean expected = true;
		assertEquals(expected, actual);
	}

	@Test
	public void test_2008() {
		leap.setYear(2008);
		boolean actual = leap.isLeapYear();
		boolean expected = true;
		assertEquals(expected, actual);
	}

	@Test
	public void test_2000() {
		LeapYear leap = new LeapYear();
		leap.setYear(2000);
		boolean actual = leap.isLeapYear();
		boolean expected = true;
		assertEquals(expected, actual);
	}

	@Test
	public void test_1900() {
		leap.setYear(1900);
		boolean actual = leap.isLeapYear();
		boolean expected = false;
		assertEquals(expected, actual);
	}

	@Test
	public void test_1700() {
		leap.setYear(1700);
		boolean actual = leap.isLeapYear();
		boolean expected = false;
		assertEquals(expected, actual);
	}

	@Test
	public void test_2100() {
		leap.setYear(2100);
		boolean actual = leap.isLeapYear();
		boolean expected = false;
		assertEquals(expected, actual);
	}

	@Test
	public void test_2001() {
		leap.setYear(2001);
		boolean actual = leap.isLeapYear();
		boolean expected = false;
		assertEquals(expected, actual);
	}

}
