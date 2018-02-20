class Emp 
{
	 static int k;
Emp()
	{
		
		System.out.println("Emp_ID="+k);
		k++;
	}
	Emp(int j)
	{
		this();
		System.out.println("Emp_Salary="+j);
	}
	Emp(char c)
	{
		System.out.println("Emp_Grade="+c);
	}

	public static void main(String[] args) 
	{
		k=1234;
		Emp e2=new Emp(9000);
		Emp e3=new Emp('D');
		Emp e4=new Emp(87897);
		Emp e5=new Emp('A');
		Emp e6=new Emp(98988);
		Emp e7=new Emp('C');
		System.out.println("done");
	}
}
