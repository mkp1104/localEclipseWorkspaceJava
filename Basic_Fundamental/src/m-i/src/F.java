interface E
{
	void test1(int i,int j);
}
abstract class  F implements E
{
	public void test1(int i,double j)
	{
		System.out.println("from test1");
	}

}
