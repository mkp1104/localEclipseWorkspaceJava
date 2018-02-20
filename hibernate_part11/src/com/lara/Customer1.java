package com.lara;
import org.hibernate.Session;
public class Customer1 
{
public static void main(String[] args) 
{
Session s1=Util.openSession();
Production p1=(Production)s1.load(Production.class, 1);
p1.setId(1);
p1.setProductName("Car");
p1.setPrice(61000);
Production p2=(Production)s1.load(Production.class, 2);
p2.setId(2);
p2.setProductName("Ship");
p2.setPrice(31000);
s1.beginTransaction();
s1.update(p1);
s1.update(p2);
s1.getTransaction().commit();

s1.flush();
s1.close();
}
}
