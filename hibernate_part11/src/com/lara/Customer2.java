package com.lara;
import org.hibernate.Session;
public class Customer2 
{
public static void main(String[] args) 
{
Session s1=Util.openSession();
Production p1=(Production)s1.load(Production.class, 1);
p1.setId(3);
p1.setProductName("Bus");
p1.setPrice(150000);
Production p2=(Production)s1.load(Production.class, 2);
p2.setId(2);
p2.setProductName("Train");
p2.setPrice(3100000);
s1.beginTransaction();
s1.saveOrUpdate(p1);
s1.saveOrUpdate(p2);
s1.getTransaction().commit();
s1.flush();
s1.close();
}
}
