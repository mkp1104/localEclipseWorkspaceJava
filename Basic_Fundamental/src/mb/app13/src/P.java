package mb.app13.src;

class O

{
O()
	{
System.out.println("O()");
}
	{
	System.out.println("O-IIB");
	}
}



class P extends O

{
	P(int i)
	{
	System.out.println("P(int)");
	
	}
	{
	System.out.println("P-IIB");
	}
	public static void main(String[] args) 
	{
		O o1=new O();
		System.out.println("------");
		P p1=new P(10);
		System.out.println("------");
	}
}
