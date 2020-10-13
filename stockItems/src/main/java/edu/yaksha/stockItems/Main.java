package edu.yaksha.stockItems;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args )
    {
    	 Scanner scanner=new Scanner(System.in);
         System.out.println("Enter number of item details to enter:");
         int no=Integer.parseInt(scanner.nextLine());
         Set<Item> itemSet=new HashSet<>();
         for(int i=0;i<no;i++)
         {
        	 System.out.println("Enter item details:");
        	 String itemDetails=scanner.nextLine();
        	 itemDetails=itemDetails.toUpperCase();
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
         itemSet.forEach(System.out::println);

        	 
         
         
    }
}
