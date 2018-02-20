
class C<X>
{
X i;
}
public class Manager2 {
public static void main(String[] args) {
	
	C<String>c1=new C<String>();
	C<Integer>c2=new C<Integer>();
	C<Double>c3=new C<Double>();
	c1.i="abc";
	c2.i=282;
	c3.i=23.789;
	
	System.out.println("done");
}
}
