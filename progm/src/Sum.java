class Sum 
{
	static int sum; 
	Sum(int i,int j,int k)//you can also take Sum(int m,int l,int n)
	{
		if(k==13)//m==13
		{
			sum=i+j;
	System.out.println("sum="+sum);		
		}
		if(k==13)//l==13
		{
			sum=i;
	System.out.println("sum="+sum);
		
		}
		if(i!=13 && j!=13 && k!=13)
		{
	sum=i+j+k;
	System.out.println("sum="+sum);
	}
	}
	public static void main(String[] args) 
	{
		Sum s1=new Sum(1,4,6);
		Sum s2=new Sum(1,4,13);
		Sum s3=new Sum(1,13,6);

		System.out.println("main() end!");
	}
}
