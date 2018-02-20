class Summ 
{
	static int x;
	static void sum(int i,int j,int k)
	{
		if (k==13)
		{
			x=i+j;
			System.out.println("sum= " +x);
		}
		if (j==13)
		{
			x=i;
			System.out.println("sum= " +x);
		}
		if (i!=13 && j!=13 && k!=13)
		{
			x=i+j+k;
		System.out.println("sum= " +x);
		}
	}
	public static void main(String[] args) 
	{
		sum(1,5,6);
		sum(1,5,13);
		sum(1,13,6);
		System.out.println("Main end!");
	}
}
