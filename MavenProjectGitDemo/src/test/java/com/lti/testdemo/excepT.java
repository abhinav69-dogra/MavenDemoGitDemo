package com.lti.testdemo;

import static org.junit.Assert.assertThrows;

import org.junit.jupiter.api.*;

import Demo.Calc;

public class excepT {
	
   @Test
   public void testexcep(){
	   Calc c=new Calc();
	   final Exception e=assertThrows(ArithmeticException.class, ()->{c.srchEmp(0);});
	   Assertions.assertEquals("u enterede zero", e.getMessage());
   }
}
