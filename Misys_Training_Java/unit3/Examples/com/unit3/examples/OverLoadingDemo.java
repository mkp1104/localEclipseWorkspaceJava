package com.unit3.examples;
class OverLoadingDemo 
{
	public int add()
	{
		return 100;
	}
	public int add(int x , int y)
	{
		return x + y;
	}
	//error cannot overload a method based on the return type
	/*public double add()
	{
		return 111.11;
	}*/
	public double add(double x , double y)
	{
		return x + y;
	}
	public String add(String string1 , String string2)
	{
		return string1 + string2;
	}
	public static void main(String[] args) 
	{
		OverLoadingDemo demo = new OverLoadingDemo();
		int num1 = demo.add(10,20);
		double num2 = demo.add(11.11 , 22.22);
		String string = demo.add("Hello" , " World");
		System.out.println(string);
	}
}
