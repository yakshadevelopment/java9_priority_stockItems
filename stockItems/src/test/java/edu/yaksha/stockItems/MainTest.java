package edu.yaksha.stockItems;

import static org.junit.Assert.*;

import org.junit.Test;


import static edu.yaksha.stockItems.TestUtils.*;
public class MainTest {

	@Test
	public void testMain() throws Exception {
		yakshaAssert(currentTest(),true,businessTestFile);
		
	}
	
	@Test
    public void testExceptionConditon() throws Exception{
	 yakshaAssert(currentTest(),true,boundaryTestFile);
      }

	@Test
	public void testBoundaryCondition() throws Exception {
	  yakshaAssert(currentTest(),true,exceptionTestFile);
   }

}
