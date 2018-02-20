package mb.app5.src;
class Y

{
	public static int test1(int i)
	{
		return i++;

	}
	static int test2(int i)
	{
	return ++i;
	}
	public static void main(String[] args) 
	{
		int i=0;
		int j=i++ + i + test1(i++) + i + ++i + i +test1(++i) + i + ++i + i + test2(++i) + i + i++ + i + test2(i++) + i;
		System.out.println(i);
		System.out.println(j);
	}
}
