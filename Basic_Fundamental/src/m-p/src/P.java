class P 
{
	int i;
	void test1(P p1,P p2)
	{
	int i=p1.i;
	p1.i=p2.i;
	p2.i=i;

	}
	void test2(P p1)
	{
	int i=this.i;
	this.i=p1.i;
	p1.i=i;
	}
	public static void main(String[] args) 
	{
		P p1=new P();
		P p2=new P();
		p1.i=1;
		p2.i=2;
		p1.test1(p1,p2);
		System.out.println(p1.i+","+p2.i);
		p1.test2(p2);
		System.out.println(p1.i+","+p2.i);
	}
}
