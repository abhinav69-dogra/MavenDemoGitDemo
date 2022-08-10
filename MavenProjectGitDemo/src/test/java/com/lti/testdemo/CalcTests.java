package com.lti.testdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import Demo.Calc;

class CalcTests {

	Calc c=new Calc();
//	@Test
//	public void testSayHello() {
//		Assertions.assertEquals("hello world",c.hell());
//	}
	@Test
	public void testSub() {
		int res=c.sub(300, 100);
		Assertions.assertEquals(200,res);
	}
    @RepeatTest(value=3,name="Repeat 3 times")
    public void RepeatTest() {
    	Assertions.
    }
}
