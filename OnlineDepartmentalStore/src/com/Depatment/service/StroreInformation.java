package com.Depatment.service;

import java.util.ArrayList;

import com.Department.model.Item;
import com.Department.model.Product;

public class StroreInformation {
	
	public void getProducts(ArrayList<Product> prd,ArrayList<Item> item,int noOfItems)
	{
		System.out.println("productId---productName---category---quantity---sellingPrice");
		for(int i=0;i<noOfItems;i++)
		{
			System.out.println(prd.get(i).getProductId()+"---"+
					prd.get(i).getProductName()+"---"+
					item.get(i).getCategory()+"---"+
					prd.get(i).getProductId()+"---"+
					prd.get(i).getAvaliableQuantity());
		}
	}
	public void getProductNameById(ArrayList<Product> prd,int noOfItems,int userProductId)
	{
		for(int i=0;i<noOfItems;i++)
		{
			if(prd.get(i).getProductId() == userProductId)
			{
				System.out.println("Product name : "+ prd.get(i).getProductName());
			}
		}
	}
	public void getProductByCategory(ArrayList<Product> prd,ArrayList<Item> item,int noOfItems,String category)
	{
		System.out.println("productId---productName---category---quantity---sellingPrice");
		for(int i=0;i<noOfItems;i++)
		{
			if(item.get(i).getCategory().equalsIgnoreCase(category))
			{
				for(int j=0;j<noOfItems;j++)
				{
					if(item.get(i).getItemName().equalsIgnoreCase(prd.get(j).getProductName()))
					{
						System.out.println(prd.get(j).getProductId()+"---"+
								prd.get(j).getProductName()+"---"+
								item.get(j).getCategory()+"---"+
								prd.get(j).getProductId()+"---"+
								prd.get(j).getAvaliableQuantity());
					}
				}
			}
			
		}
	}
	public void getProductsByProductName(ArrayList<Product> prd,ArrayList<Item> item,int noOfItems,String UserProduct)
	{
		System.out.println("productId---productName---category---quantity---sellingPrice");
		for(int i=0;i<noOfItems;i++)
		{
			if(prd.get(i).getProductName().equalsIgnoreCase(UserProduct))
			{
				System.out.println(prd.get(i).getProductId()+"---"+
						prd.get(i).getProductName()+"---"+
						item.get(i).getCategory()+"---"+
						prd.get(i).getProductId()+"---"+
						prd.get(i).getAvaliableQuantity());
			}
		}
	}
	public double getTotalAmount(ArrayList<Product> prd,ArrayList<Item> item,int noOfItems)
	{
		double price = 0;
		for(int i=0;i<noOfItems;i++)
		{
			price+=item.get(i).getBuyingPrice()*prd.get(i).getAvaliableQuantity();
		}
		return price;
	}
	public double getTotalProfit(ArrayList<Product> prd,ArrayList<Item> item,int noOfItems)
	{
		double totalProfit =0;
		StroreInformation si = new StroreInformation();
		double buyingPrice = si.getTotalAmount(prd, item, noOfItems) ;
		double sellingPrice = 0;
		for(int i=0;i<noOfItems;i++)
		{
			sellingPrice +=prd.get(i).getSellingPrice();
		}
		totalProfit = sellingPrice - buyingPrice;
		return totalProfit;
	}
	
	

}
