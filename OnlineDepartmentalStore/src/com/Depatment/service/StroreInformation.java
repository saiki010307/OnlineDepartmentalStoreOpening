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
						System.out.println(prd.get(i).getProductId()+"---"+
								prd.get(i).getProductName()+"---"+
								item.get(i).getCategory()+"---"+
								prd.get(i).getProductId()+"---"+
								prd.get(i).getAvaliableQuantity());
					}
				}
			}
			
		}
	}
	
	

}
