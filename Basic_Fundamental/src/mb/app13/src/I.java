package mb.app13.src;

class I 
{
	I()
	{
		System.out.println("I()");
	}
	{
		System.out.println("IIB");
	}
	I(int i)
	{
		System.out.println("I(int)");
	}
	I(double d)
	{
	this();

		System.out.println("I(double)");
	}
	public static void main(String[] args) 
	{
		I i1=new I();
		System.out.println("-----");
		I i2=new I(10);
		System.out.println("-----");
		I i3=new I(2.0);
		System.out.println("-----");
	}
}
