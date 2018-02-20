package generics;

interface M<Y>
{
Y test1(Y i);
}
class N<Y> implements M<Y>
{
	public Y test1(Y i)
	{
		return i;
	}
}
public class Manager10 
{
public static void main(String[] args) 
{

	N<String> n=new N<String>();
	System.out.println(n.test1("xyz"));
	System.out.println("done");
	N<Integer> n1=new N<Integer>();
	System.out.println(n1.test1(12));
	System.out.println("done");
}
}
