package mb.app5.src;
class Z1 
{
	public static int test(int i)
	{
	return i++;
	}
	public static void main(String[] args) 
	{
		int i=0;
		i=i++ + i + test(i++) + i;
		System.out.println(i);
	}
}
