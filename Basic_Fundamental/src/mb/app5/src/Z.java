package mb.app5.src;
class Z 
{
	public static int test1(int i) 
	{
	return i++;
	}
	public static int test2(int i)
	{
	return test1(++i);
	}
	public static int test3(int i)
	{
	return test1(i++);
	}
	public static void main(String[] args) 
	{	
		int i=0;
		int j=test1(i++) + i;
		System.out.println(i);
		System.out.println(j);
		i=j=0;
		j=test1(++i) + i;
		System.out.println(i);
		System.out.println(j);
		i=j=0;
		j=test2(++i) + i;
		System.out.println(i);
		System.out.println(j);
		i=j=0;
		j=test3(++i) + i;
		System.out.println(i);
		System.out.println(j);
		i=j=0;
		j=test3(++i) + i + test1(i++) + i +test2(i++) + i + test2(++i) + i;
		System.out.println(i);
		System.out.println(j);
	}
}