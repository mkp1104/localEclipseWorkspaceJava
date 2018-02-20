package mb.app8.src;class C
{
	static int i;
	static
	public static void main(String args[])
	{
	
	System.out.println("V-main-begin");
U.main(args);
System.out.println("---------");
U.main(null);
System.out.println("V-main-end");
	}
}
