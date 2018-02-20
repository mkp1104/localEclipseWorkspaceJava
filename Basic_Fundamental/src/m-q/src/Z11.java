class Z11 
{
	enum B1
	{
	CON1(10),CON2(30),CON4(50);
	int i;
	B1(int i)
		{
			this.i=i;
		}
	}
	public static void main(String[] args) 
	{
		B1 b1=B1.CON4;
		System.out.println(b1);
		System.out.println(B1.CON4.i);
		B1 b2=B1.CON2;
		System.out.println(b2);
		System.out.println(b2.i);
	}
}
