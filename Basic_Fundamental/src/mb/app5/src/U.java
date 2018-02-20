package mb.app5.src;
class U

{
	public static int test(int i)
	{

	return i--;
	}
	public static void main(String[] args) 
	{
		int i=0;
		System.out.println(i);
		i=test(i--);
		System.out.println(i);
	}
}
