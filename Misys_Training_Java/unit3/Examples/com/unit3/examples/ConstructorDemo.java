package com.unit3.examples;
class Product
{
	String productId;
	String productName;
	String category;
	double price , tax;

	public Product(String productId , String productName , String category , double price)
	{
		this.productId = productId;
		this.productName = productName;
		this.category = category;
		this.price = price;
		if(price >= 1000.00 && category.equals("luxury"))
			tax = price * 0.20;
		else
			tax = price * 0.10;
	}
	public void getProductDetails()
	{
		System.out.println("Product Id : "+productId);
		System.out.println("Product Name : "+productName);
		System.out.println("Product category : "+category);
		System.out.println("Product price : "+price);
		System.out.println("Product tax : "+tax);
	}
}
class ConstructorDemo 
{
	public static void main(String[] args) 
	{
		Product p1 = new Product("P001" , "Washing Machine " , "luxury" , 1000);
		p1.getProductDetails();
		Product p2 = new Product("P002" , "Iron Box " , "basic" , 555);
		p2.getProductDetails();
	}
}
