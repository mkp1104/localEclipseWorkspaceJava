class C 
{
	 static int y;
	int i;
	C()
	{
	y++;//you can keep static member inside constructor.
	
	}
	public static void main(String[] args) 
	{
		C c1=new C();
		C c2=new C();
		C c3=new C();
		C c4=new C();
System.out.println("total no of instances="+ y);
	}
}
