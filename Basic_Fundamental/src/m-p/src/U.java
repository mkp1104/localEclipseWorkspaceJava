class U
{
	private int i,j;
	private String s1;
	U(int i,int j,String s1)
	{
	this.i=i;
	this.j=j;
	this.s1=s1;
	}
public 	int getI()
	{
	return i;
	}
	public int getJ()
	{
		return j;
	}
	public String gets1()
	{
	return s1;
	}
	public void print()
	{
	System.out.println(i+","+j+","+s1);
	}

	public static void main(String[] args) 
	{
		U u1=new U(10,50,"abc");
		u1.print();
		System.out.println(u1.getI());
		System.out.println(u1.getJ());
		System.out.println(u1.gets1());
		}
}
