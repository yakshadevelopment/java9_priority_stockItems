package edu.yaksha.stockItems;

import static org.junit.Assert.*;

import org.junit.Test;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import static edu.yaksha.stockItems.TestUtils.*;
public class ItemServiceTest {

	@Test
	public void testCollectAllItems() throws Exception {
		List<String> list=new ArrayList<String>();
		list.add("101,Salt,20,22,E");
		list.add("102,Masala,30,40,N");
		list.add("103,Sugar,25,35,E");
		list.add("101,Pickle,50,60,N");
		list.add("104,Paddy,20,15,E");
		list.add("105,Wheat,30,31,K");
	    Set<Item> set=new ItemService().collectAllItems(list);
	     int val=set.size();
	      yakshaAssert(currentTest(),(val==2?"true":"false"),businessTestFile);
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
