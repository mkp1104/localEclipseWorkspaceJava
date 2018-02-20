package logical.logical1;
public class Factorial_call
{
public static int fact(int x)
{
	
int fact=x;
while(x>1)
/*{
fact=fact*(x-1);
x=x-1;
}*/
{
fact=fact*(--x);	
}
return fact;
}
}
