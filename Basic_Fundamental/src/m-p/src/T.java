class T
{
	private int i,j;
	
	S(int i)
	{
	this.i=i;
	}
	int get()
	{
	return i;
	}
}
class T
{

	public static void main(String[] args) 
	{
		S s1=new S(90);
		System.out.println(s1.get());
		System.out.println(s1.get());
		System.out.println(s1.get());
		S s2=new S(190);
		System.out.println(s2.get());
		System.out.println(s2.get());
		System.out.println(s2.get());
	}
}
