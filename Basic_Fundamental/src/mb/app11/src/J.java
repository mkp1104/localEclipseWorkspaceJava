package mb.app11.src;
class J 
{
	J()
	{
	System.out.println("J()");
	}
	{
	System.out.println("J-IIB");
	}
	J(int i)
	{
	this();
	System.out.println("J(int)");
	}
	static
	{
	System.out.println("J-SIB");
	}
	public static void main(String[] args) 
	{
		J  j1=new J();
		System.out.println("-----");
		J j2=new J(90);
		System.out.println("-----");
	}
}
