package com.lara;
import org.hibernate.Session;
public class Customer1 
{
public static void main(String[] args) 
{
Session s1=Util.openSession();
Product p1=new Product();
p1.setId(1);
p1.setProductName("Freeze");
p1.setPrice(60000);
Product p2=new Product();
p2.setId(2);
p2.setProductName("WashingMachine");
p2.setPrice(30000);
s1.beginTransaction();
s1.update(p1);
s1.update(p2);
s1.getTransaction().commit();

s1.flush();
s1.close();
}
}
