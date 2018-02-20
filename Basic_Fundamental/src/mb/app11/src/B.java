package mb.app11.src;
class B 
{
	B()
	{
	System.out.println("B()");
	}
	{
	System.out.println("IIB");
	}
	public static void main(String[] args) 
	{
		System.out.println("------");
		B b1=new B();
		System.out.println("------");
		B b2=new B();
	}
}
