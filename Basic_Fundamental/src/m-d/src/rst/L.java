package rst;
class L extends I 
{
	public static void main(String[] args) 
	{
		L obj1=new L();
		System.out.println(obj1.j);
		System.out.println(obj1.k);
		I obj2=new I();// nothing error here ! you can create object.
	System.out.println(obj2.j);// this line giving error ! you can't use object of super class.j is protected.
		System.out.println(obj2.k);
	}
}
