package com.adder.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.adder.Addition;

public class TestAddition {

	Addition obj = new Addition();
	@Test
	public void test() {
		assertEquals("",obj.add());
	}

}
