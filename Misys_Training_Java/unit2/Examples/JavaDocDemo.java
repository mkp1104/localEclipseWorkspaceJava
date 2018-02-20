/** This program is to demonstrate the use of javadoc tool
	 @author Sindhu
	*/
public class  JavaDocDemo
{
	/** This variable holds the value of the computed sum */
	public static int sum = 0;
	/** This is the main() method
	   This is the point at which execution starts */
	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
			sum = sum + i;
		System.out.println(sum);
	}
}
