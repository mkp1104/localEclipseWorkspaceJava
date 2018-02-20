class Z21 //for all RnD progm first compile then run,because ther same name of containing claass for other program also...(for me only)
{
	enum D
	{
	CON(10),CON1(90),CON2(80);
	int i;
	D(int i)
		{
			this.i=i;
			System.out.println("D()");
		}
		
	static	{
			System.out.println("SIB");
			System.out.println(CON1.i);
			}
	}
	public static void main(String[] args) 
	{
		D d1=D.CON2;
		System.out.println(d1);
		System.out.println(d1.i);
		D d2=D.CON1;
		System.out.println(d2);
		System.out.println(d2.i);
		}
}
