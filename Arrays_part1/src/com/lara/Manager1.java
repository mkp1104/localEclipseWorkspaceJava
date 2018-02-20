package com.lara;
import java.util.Arrays;
 class A
{
	 A()
	 {
		 
		 
	 }
	 static int y=10;
	 public static void test()
	 {
		 System.out.println("Test()");
		 
	 }
	int i;
	A(int i)
	{
	this.i=i;
	}
}  
 class B1 extends A
 {
	 
	 
 }
 
 
public class Manager1
{
	public static void main(String[] args) 
	{
		A[]x=new A[2];
	//	x[0]=10;
	//		x[0]=A.y;
	//		x[0]="abc";
	//		x[0]=A.test();
	//	x[0]=new A(10);
	//	x[0]=10;
		String[] s=new String[2];
	//	s[0]=10;
		s[0]=new String("acs");
		s[1]="abc";
		x[0]=new B1();
		x[1]=new A(90);
		System.out.println(x);
		System.out.println(x[0].i);
		System.out.println(Arrays.toString(x));
	}
}
