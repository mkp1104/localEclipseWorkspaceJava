import java.io.*;

class FileDemo 
{
	public static void main(String[] args) throws Exception
	{
		File file = new File("FileDemo.java");
		if(file.exists())
			System.out.println("The file exists...");
		else
		{
			System.out.println("The file does not exist, creating a new file...");
			file.createNewFile();	
		}
		System.out.println("Absoulte path of the file "+file.getAbsolutePath());
	}
}
