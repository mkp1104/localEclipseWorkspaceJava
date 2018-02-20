package mb.app10.src;

class R 
{
	R()
	{
	System.out.printl("R()");
	}
	R(int i)
	{
	System.out.println("R(int)");
	this(12);
	}
	public static void main(String[] args) 
	{
		R r1=new R();
		System.out.println("R()");
		R r2=new R(90);
		System.out.println("R(int)");
	}
}
