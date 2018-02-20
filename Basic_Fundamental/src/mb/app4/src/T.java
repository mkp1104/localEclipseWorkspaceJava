package mb.app4.src;

class T 
{
	public static int test()
	{
		System.out.println("From test");
		return 10;
	}
	public static void main(String[] args) 
	{

		int i=test();
		int j=10+test();
		System.out.println(test());
		System.out.println(i);
		System.out.println(j);
		System.out.println(i+j+test());

	}
}
