package com.unit3.examples;
class StaticMembersDemo
{
	private static int num;
	private static String str;
	private String str1;

	//initialisation of static data members using static block
	static
	{
		num = 100;
		str = "Hello World";
	}

	//compilation error cannot access non-static members from a static method
  /*public static void changeValue()
	{
		str1 = "Have a nice day";
	}*/
	
	//accessing static members from non-static method
	public void changeStaticData()
	{
		num = 111;
		str = "Have a nice day";
	}
	public static void main(String[] args) 
	{
		System.out.println("Accessing static member str ");
		System.out.println("Static str : "+StaticMembersDemo.str);
		System.out.println("Int num : "+StaticMembersDemo.num);
		StaticMembersDemo demo = new StaticMembersDemo();
		demo.changeStaticData();
		System.out.println("Static str : "+StaticMembersDemo.str);
		System.out.println("Int num : "+StaticMembersDemo.num);
	}
}
