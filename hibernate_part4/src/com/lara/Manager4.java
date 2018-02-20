package com.lara;
import org.hibernate.Session;
public class Manager4 
{
public static void main(String[] args)
{
Session s1=Util.openSession();
Human h1=(Human)s1.load(Human.class, 1);
Person p1=(Person)s1.load(Person.class, 2);
Employee e1=(Employee)s1.load(Employee.class, 3);
s1.beginTransaction();
s1.delete(h1);
s1.delete(p1);
s1.delete(e1);
s1.getTransaction().commit();
s1.flush();
s1.close();
System.out.println("done");
}
}
