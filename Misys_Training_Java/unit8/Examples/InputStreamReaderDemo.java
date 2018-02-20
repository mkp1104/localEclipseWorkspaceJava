import java.io.*;

class InputStreamReaderDemo 
{
	public static void main(String[] args) throws Exception
	{
		String str = null;
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		str = r.readLine();
		System.out.println(str);
	}
}
