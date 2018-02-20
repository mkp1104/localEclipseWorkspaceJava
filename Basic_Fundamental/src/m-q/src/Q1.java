enum P1 
{
	CON1,CON2,CON3;
}
class Q1
{

	public static void main(String[] args) 
	{
		P1 p1=P1.valueOf("CON2");
		System.out.println(p1);
		P1 p2=P1.valueOf("CON3");
		System.out.println(p2);
		P1 p3=P1.values();
		System.out.println(p3);
	}
}
