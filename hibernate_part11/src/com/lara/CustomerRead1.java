package com.lara;
import org.hibernate.Session;
public class CustomerRead1 
{
public static void main(String[] args) 
{
Session s1=Util.openSession();
Production p1=(Production)s1.get(Production.class, 1);
System.out.println(p1.getId());
System.out.println(p1.getProductName());
System.out.println(p1.getPrice());
System.out.println(p1.getSalesPrice());
}
}
//Hibernate: select product0_.id as id1_0_0_, product0_.ProductName as ProductN2_0_0_, product0_.Price as Price3_0_0_, 2*product0_.Price as formula0_0_ from Product product0_ where product0_.id=?
//Hibernate: select product0_.id as id1_0_0_, product0_.ProductName as ProductN2_0_0_, product0_.Price as Price3_0_0_, 2*product0_.Price as formula0_0_ from Product product0_ where product0_.id=?
