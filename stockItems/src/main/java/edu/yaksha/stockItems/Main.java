package edu.yaksha.stockItems;

import java.util.ArrayList;
import java.util.List;
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
          List<String> inputList=new ArrayList<String>();
         for(int i=0;i<no;i++)
         {
        	 System.out.println("Enter item details:");
        	 String itemDetails=scanner.nextLine().toUpperCase();
        	 inputList.add(itemDetails);
         }
        	
         Set<Item> itemSet=new ItemService().collectAllItems(inputList);
         itemSet.forEach(System.out::println);

        	 
         
         
    }
}
