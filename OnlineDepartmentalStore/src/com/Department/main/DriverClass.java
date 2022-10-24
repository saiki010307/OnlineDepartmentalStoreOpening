package com.Department.main;

import java.util.ArrayList;
import java.util.Scanner;

import com.Department.model.Item;
import com.Department.model.Product;
import com.Depatment.service.StroreInformation;
import com.hcl.gl.main.MainApplication;

public class DriverClass {
	 
	
	public static void main(String[] args) {
		
		MainApplication loginPage = new MainApplication();
		loginPage.main1();
		
		Scanner scan = new Scanner(System.in);
		StroreInformation si = new StroreInformation();
		ArrayList<Product> prd = new ArrayList<Product>() ;
		ArrayList<Item> item = new ArrayList<Item>();
		System.out.println("enter number of items to add : ");
		int noOfItems = scan.nextInt();
		for(int i=0;i<noOfItems;i++)
		{
			System.out.println("Enter Product id : ");
			int pid = scan.nextInt();
			System.out.println("Enter Product Name : ");
			String pName=scan.next();
			scan.nextLine();
			System.out.println("Enter category (Grocery, Stationary, Toiletry, Vegetables) : ");
			String category = scan.next();
			scan.nextLine();
			System.out.println("Enter Product buying price : ");
			double bPrice = scan.nextDouble();
			double sPrice = ((bPrice*0.5)+bPrice);
			System.out.println("Enter Product Quantity : ");
			int Quantity = scan.nextInt();
			prd.add(new Product(pid,pName,sPrice,Quantity));
			item.add(new Item(pName,category,bPrice));
		}
		int option;
		do {
			showOptions();
			option = scan.nextInt();
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
			case 4 : System.out.println("Enter product name : ");
					 String UserProductName = scan.next();
					 si.getProductsByProductName(prd, item, noOfItems, UserProductName);
					 break;
			case 5 : double totalPrice = si.getTotalAmount(prd, item, noOfItems);
					 System.out.println("Total Price spent on products : "+totalPrice);
					 break;
			case 6 : double totalProfit = si.getTotalProfit(prd, item, noOfItems);
					 System.out.println("Total profit : "+totalProfit);
					 break;
			default : System.out.println("Enter valid option");
			}
		}while(option!=0);
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
