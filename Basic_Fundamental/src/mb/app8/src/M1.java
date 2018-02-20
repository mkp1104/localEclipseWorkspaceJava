package mb.app8.src;class L1
{
	static {
	System.out.println("SIB-L1");
	}
	public static int test(int i) 
	{
		System.out.println("L-Main");
		System.out.println(i);
	
	return i;
	
	}
}
class M1
{
	static {
	System.out.println("SIB-M");
	}
	public static void main(String[] args) 
	{
		System.out.println("M-Main-begin");
	L1.test(10);
	System.out.println("M-Main-end");
	}
	
}
