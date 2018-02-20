package try_catch_part2;

public class AgeIsNegative extends ArithmeticException 
{
AgeIsNegative()
{
	
}
AgeIsNegative(String msg)
{
	super(msg);
}
}
