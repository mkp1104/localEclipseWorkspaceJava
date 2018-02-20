import java.io.*;

class StringWriterDemo 
{
	public static void main(String[] args) 
	{
		BufferedReader br = null;
		StringWriter writer = new StringWriter();
		String str;	
		try
		{
			br = new BufferedReader(new FileReader("MyText.txt"));
			for(str = br.readLine(); br.readLine()!=null; str = br.readLine())
			{
				writer.write(str);
				System.out.println(str);
			}
			System.out.println(writer);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				br.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}