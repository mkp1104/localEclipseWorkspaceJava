package com.lara;
import org.hibernate.Session;
public class Manager 
{
public static void main(String[] args) 
{
Session s1=Util.openSession();
Porson p1=new Porson();
p1.setFirstName("Moinsh");
p1.setLastName("Prosad");
p1.setAge(23);
s1.beginTransaction();
s1.save(p1);
s1.getTransaction().commit();
s1.flush();
s1.close();
}
}
