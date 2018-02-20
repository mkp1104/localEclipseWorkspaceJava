package mb.app12.src;
class W
{
W(int)
	{
System.out.println("W()");

}

}
class X extends W 
{
	X(int)
	{
	super();
	System.out.println("X()");
	}
	public static void main(String[] args) 
	{
		W w=new W(12);
		System.out.println("------");
		X x=new X(90);
		System.out.println("------");
	}
}