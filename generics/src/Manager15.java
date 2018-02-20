class W<A>
{
A i;	
}
public class Manager15 
{
public static void main(String[] args) 
{
W<?> obj1=new W<Integer>();
//obj1.i=10;
 obj1=new W<Double>();
//obj1.i=10.90;
obj1=new W<String>();
//obj1.i="abc";
obj1=new W<Integer>();
W<Integer> w1=new W<Integer>();
w1.i=90;
System.out.println(w1.i);
W w=new W();

}
}
