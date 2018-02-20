package mb.app11.src;
class I 
{
	I()
	{
	System.out.println("I()");
	}
	{
	System.out.println("IIB");
	}
	static 
	{
	System.out.println("SIB");
	}
	public static void main(String[] args) 
	{
		I i1=new I();
		System.out.println("-----");
		I i2=new I();
		System.out.println("-----");
		I i3=new I();
		System.out.println("-----");
	}
}
