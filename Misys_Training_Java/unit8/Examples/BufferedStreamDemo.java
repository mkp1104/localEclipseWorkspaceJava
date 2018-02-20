import java.io.*;

class BufferedStreamDemo 
{
	public static void main(String[] args) throws Exception
	{
		int c = 0;
		File file1 = new File("Dream.jpg");
		File file2 = new File("MyDream.jpg");
		BufferedInputStream in = null;
		BufferedOutputStream out = null;
		try
		{
			in = new BufferedInputStream(new FileInputStream(file1));
			out = new BufferedOutputStream(new FileOutputStream(file2));
			while(c != -1)
			{
				c = in.read();
				out.write(c);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			in.close();
			out.close();
		}
	}
}
