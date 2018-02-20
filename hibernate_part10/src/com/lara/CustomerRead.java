package com.lara;
import org.hibernate.Session;
public class CustomerRead 
{
public static void main(String[] args) 
{
Session s1=Util.openSession();
Product p1=(Product)s1.load(Product.class,1);
System.out.println("Id :"+p1.getId());
System.out.println("ProductName:"+p1.getProductName());
//System.out.println("Price:"+p1.getPrice());
//System.out.println("SalesPrice:"+p1.getSalesPrice());

}
}
