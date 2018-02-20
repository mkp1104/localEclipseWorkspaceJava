package com.lara;


class T2
{
T2()
{
super();
display();	
see();
}
public void display()
{
System.out.println("Display Method");	
}
public void see()
{
System.out.println("SEE");	
}
}
public class Test1
{
public static void main(String[] args) 
{
T2 t=new T2();
System.out.println("Test1-class");
}	
}