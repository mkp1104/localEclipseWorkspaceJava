class M<A>
{
public void test(A i)
{
System.out.println("test()");	
}
}
public class Manager16 
{
public static void main(String[] args) 
{
M<?> m=null;
//m.test(10);
M<? extends Number> m1=null;
//m1.test(123);
M<? super Number> m2=null;//by default it takes Number so all subclass to number will be accepted!!!
m2.test(19);

//m2.test("xyz");
m2.test(19.89);
//m2.test(true);

}
}
