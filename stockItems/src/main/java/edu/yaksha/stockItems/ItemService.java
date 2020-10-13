package edu.yaksha.stockItems;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ItemService {
	public Set<Item> collectAllItems(List<String> inputList)
	{
		 Set<Item> itemSet=new HashSet<>();
		 for(String itemDetails:inputList)
		 {
		String itemArr[]=itemDetails.split(",");
    	 try
    	 {
    		 if((! itemArr[4].equalsIgnoreCase("E")) && (!itemArr[4].equalsIgnoreCase("N")))
    			throw new GradeMismatchedException();
    		 double pPrice=Double.parseDouble(itemArr[2]);
    		 double sPrice=Double.parseDouble(itemArr[3]);
    		 if(pPrice>sPrice)
    			 throw new PriceException();
    		 if(itemArr[4].equalsIgnoreCase("E"))
    		 {
    			 double val=sPrice-pPrice;
    			 val=(val/pPrice)*100;
    			 if(val>25)
    				 throw new EssentialCommodityException();
    		 }
    		 Item item=new Item(Integer.parseInt(itemArr[0]),itemArr[1],pPrice,sPrice,itemArr[4]);
    		 itemSet.add(item);

    	 }
    	 catch(PriceException p) {}
    	 catch(GradeMismatchedException g) {}
    	 catch(EssentialCommodityException e) {}
     }// end of loop
		 return itemSet;
	}
	

}
