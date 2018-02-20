import java.io.*;

class StreamPrinter 
{
	public static void main(String[] args) 
	{
		int data = 0;
		try
		{
			while(true)
			{
				data = System.in.read();
				if(data == -1) break;
				System.out.write(data);
			}
		}
		catch(Exception e)
		{
			System.out.println("Could not read from System.in!...");
		}
	}
}
