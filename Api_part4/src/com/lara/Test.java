package com.lara;
class A1
{}
class B1
{}
class C1
{}
class D1
{}
public class Test
{
	public static void main(String[] args) {
	A1 a=new A1();
	B1 b=new B1();
	C1 c=new C1();
	D1 d=new D1();
//	A a1=(A)b;
	Object obj=a;
	A1 a2=(A1)obj;
	System.out.println("done");
	
	}
	}