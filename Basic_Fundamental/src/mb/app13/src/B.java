package mb.app13.src;

class A
{
	A(int i)
	{
	System.out.println("A(int)");
	}
}

class B extends A
{
	B(int i)
		{
	System.out.println("B(int)");
	}
	public static void main(String[] args) 
	{
		A a=new A(9);
		System.out.println("------");
		B b=new B(8);
		System.out.println("------");
	}
}
