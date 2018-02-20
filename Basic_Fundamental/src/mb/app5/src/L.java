package mb.app5.src;
class L 
{
	public static int test()
	{
	int i;
	i = 0;
	return i++;
	}
	public static void main(String[] args) 
	{
		int i=0;
		System.out.println(test());
		System.out.println(i);
	}
}
