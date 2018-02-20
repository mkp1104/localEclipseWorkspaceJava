package com.lara;
import org.hibernate.Session;
public class Manager3 
{
public static void main(String[] args)
{
Session s1=Util.openSession();
Human1 h1=(Human1)s1.load(Human1.class, 1);
//Human h1=(Human)s1.get(Human.class, 1);
h1.setFirstName("Raju");
Person1 p1=(Person1)s1.load(Person1.class, 2);
p1.setAddress("Delhi");
Employee1 e1=(Employee1)s1.load(Employee1.class, 3);
e1.setEmail("manish.aec1991@gmail.com");
s1.beginTransaction();
s1.update(h1);
s1.update(p1);
s1.update(e1);
s1.getTransaction().commit();
s1.close();
System.out.println("done");
}
}
