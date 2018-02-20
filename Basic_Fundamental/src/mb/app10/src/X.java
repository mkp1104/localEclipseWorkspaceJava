package mb.app10.src;

class X 
{
	static 
	{
	System.out.println("SIB1");
	}
	static 
	{
		System.out.println("SIB2");
	}
	X()
	{
		System.out.println("X()");
	
	}
	X(int i)
	{
	this();
		System.out.println("X(int)");
	}
	public static void main(String[] args) 
	{
		X x1=new X();
		System.out.println("-----");
		X x2=new X(10);
		System.out.println("-----");
	}
}
