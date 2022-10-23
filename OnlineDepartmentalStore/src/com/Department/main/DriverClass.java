package com.Department.main;

import java.util.ArrayList;
import java.util.Scanner;

import com.Department.model.Item;
import com.Department.model.Product;
import com.Depatment.service.StroreInformation;

public class DriverClass {
	 
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		StroreInformation si = new StroreInformation();
		ArrayList<Product> prd = new ArrayList<Product>() ;
		 ArrayList<Item> item = new ArrayList<Item>();
		System.out.println("enter number of items to add : ");
		int noOfItems = scan.nextInt();
		for(int i=0;i<noOfItems;i++)
		{
			int pid = scan.nextInt();
			String pName=scan.next();
			scan.nextLine();
			String category = scan.next();
			scan.nextLine();
			double bPrice = scan.nextDouble();
			double sPrice = ((bPrice*0.5)+bPrice);
			int Quantity = scan.nextInt();
			prd.add(new Product(pid,pName,sPrice,Quantity));
			item.add(new Item(pName,category,bPrice));
		}
		showOptions();
		int option = scan.nextInt();
		scan.nextLine();
		//String department = null;
		switch(option)
		{
		case 1 : si.getProducts(prd, item, noOfItems);
				 break;
		case 2 : System.out.println("Enter product id : ");
				 int userProductId = scan.nextInt();	
				 si.getProductNameById(prd, noOfItems, userProductId);
				 break;
		case 3 : System.out.println("Enter category(Grocery, Stationary, Toiletry, Vegetables) : ");
				 String UserCategory = scan.next();
				 si.getProductByCategory(prd, item, noOfItems, UserCategory);
				 break;
		case 4 : 
				break;
		case 5 : 
			break;
		case 6 : 
			break;
		default : System.out.println("Enter valid department");
		}
	}
	private static void showOptions()
	{
		System.out.println("Select the option from the following : ");
		System.out.println("1.List the products in the store ");
		System.out.println("2.Search the product by using productid");
		System.out.println("3.List the products by category");
		System.out.println("4.Search the product by using the name and view the details of the product");
		System.out.println("5.To check the total amount, spend on her products");
		System.out.println("6.Display the Profit amount");
		System.out.println("------------------------------------------------------------------------------------------");
				
	}

}
