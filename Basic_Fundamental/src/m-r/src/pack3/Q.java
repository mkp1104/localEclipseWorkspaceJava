package pack3;
class Q 
{
	int i;
	public static void main(String[] args) 
	{
		Q q1=new Q();
		q1.i=10;
		Q q2=null;
		q2=q1.i;
		System.out.println(q2.i);
		
		Q q3=q2;
		System.out.println(q3.i);
		System.out.println(q1.i);
	}
}