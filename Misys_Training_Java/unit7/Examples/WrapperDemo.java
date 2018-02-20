class WrapperDemo 
{
	public static void main(String[] args) 
	{
		Integer i = new Integer(5);
		double d = Math.sqrt(i.doubleValue());
		System.out.println("Value of Integer object : " + i.intValue());
		System.out.println("Sqrt of 5 : " + d);
		try
		{
			double dbl = Double.parseDouble(args[0]);
			System.out.println("log(" + dbl + ") is " + Math.log(dbl));
		}
		catch (NumberFormatException e)
		{
			System.out.println("Invalid input, cannot be parsed to numeric type");
		}
	}
}
