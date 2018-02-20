package mb.app13.src;

class G
{
G()
	{
System.out.println("G()");
}
	{
	System.out.println("G-IIB");
	}
	static
	{
	System.out.println("G-SIB");
	}

}
class H extends G
{
	H()
{
	System.out.println("H()");
}
static
{
System.out.println("H-SIB");
}
{
System.out.println("H-IIB");
}
}
class  I extends H
{
	I()
	{
	System.out.println("I()");
	}
	static {
	System.out.println("I-SIB");
	}
	{
	System.out.println("I-IIB");
	
	}
}
class J
{
 
	public static void main(String[] args) 
	{
		G g1=new G();
		System.out.println("-----");
		H h1=new H();
		System.out.println("-----");
		I i1=new I();
		System.out.println("-----");
	}
}
class K

{
public static void main(String x[])
	{
H h1=new H();
System.out.println("---");
I i1=new I();
System.out.println("---");
G g1=new G();
System.out.println("---");

}
}
class L
{

	public static void main (String x[])
	{
	I i1 =new I();
	System.out.println("----");
	G g1=new G();
	System.out.println("----");
	H h1=new H();
	System.out.println("----");
	}
}