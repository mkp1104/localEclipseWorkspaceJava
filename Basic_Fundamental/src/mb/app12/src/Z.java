package mb.app12.src;
class Y
{
}
class Z extends Y
{
	Z(int i)
	{
	System.out.println("Y(int)");
	}
	public static void main(String[] args) 
	{
		Z z1=new Z(9); 
		System.out.println("-----");
	}
}
