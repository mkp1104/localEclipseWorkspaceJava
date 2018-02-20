package mb.app10.src;

class F 
{
	int i;
	F(int k)
	{
	  i=10;
	System.out.println("F()");
	System.out.println(i);
	
	}

	public static void main(String[] args) 
	{
		F f1=new F();
		System.out.println(f1.i);
	}
}
