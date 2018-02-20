package mb.app12.src;
class I 
{
	I()
	{
	
	System.out.println("I()");

	}

}
class J extends I
{

J()
	{
	System.out.println("J()");
	}

}
class K
{
	
	public static void main(String[] args) 
	{
		I obj1=new I();
		System.out.println("------");
		J j1=new J();
		System.out.println("------");
	}

}

	
