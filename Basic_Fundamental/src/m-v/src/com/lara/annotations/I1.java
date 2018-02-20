package com.lara.annotations;
@interface Counter
{
public int count();
}
@Counter(count=3)
class I1
	{
		@Counter(count=5)
		int m;
		@Counter(count=10)
		I1()
		{}
		@Counter(count=100)
		public static void main(String[] args) 
		{

			int y=90;
		
		System.out.println(y);
		
		System.out.println("Hello World!");
	}
}