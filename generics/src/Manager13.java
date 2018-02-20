class T<A>
{
A a1;	
}
public class Manager13
{
public static void main(String[] args) {
	T<?> t1=null;
	t1=new T<Integer>();//you must have to create object of different data type no any option!!!!
//	t1.a1=10;
	t1=new T<Number>();
//	t1=10;
	t1=new T<Object>();
//	t1.a1=123;
	t1=new T<String>();
//	t1.a1="xyz";
	t1=new T<S>();
	T<? extends Number>t2=null;
//	t2=123;
	t2=new T<Integer>();
//	t2=123;
	t2=new T<Number>();
//	t2=new T<Object>();
//	t2=new T<String>();
//	t2=new T<S>();
	T<? super Number>t3=null; 
	t3=new T<Object>();
	t3=new T<Object>();
	t3=new T<Number>();
//	t3=new T<Integer>();
//	t3=new T<String>();
//	 t3=new T<S>();
	System.out.println("done");
}	
}