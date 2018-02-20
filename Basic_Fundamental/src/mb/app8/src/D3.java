package mb.app8.src;class C
{
	static int i;
	public static void test() 
	{
		System.out.println("from test:"+i);
		
	
		
	}
}
class D3
{
	public static void main(String[] args) 
	{
			System.out.println("from main:"+C.i);
			C.test();
	}
	
}
