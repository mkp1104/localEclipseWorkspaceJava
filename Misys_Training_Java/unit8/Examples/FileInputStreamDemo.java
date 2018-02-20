import java.io.*;

class FileInputStreamDemo
{
	public static void main(String[] args) throws Exception
	{
		File sourceFile = new File("C:\\JavaCodes\\Unit6\\MyText.txt");
		FileInputStream in = new FileInputStream(sourceFile);
		File targetFile = new File("C:\\JavaCodes\\Unit6\\NewText.txt");
		FileOutputStream out = new FileOutputStream(targetFile);
	
		for(int c = in.read() ; c != -1 ; c = in.read())
		{
			out.write(c);
		}
		in.close();
		out.close();
	}
}
