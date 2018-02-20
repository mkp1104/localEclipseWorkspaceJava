import java.io.*;

class FileDemo1 
{
	public static void main(String[] args) 
	{
		File file = new File("C:\\JavaCodes");
		if(file.exists())
		{
			System.out.println("The file or directory exists");
			if(file.isDirectory())
			{
				System.out.println("The mentioned file is a directory");
				String[] list = file.list();
					System.out.println("Files and directories under C:\\JavaCodes");
					for(int i = 0 ; i<list.length ; ++i)
						System.out.println(list[i]);
			}
			else
				System.out.println("The mentioned file is a normal file");
		}
		else
			System.out.println("The file or directory does not exists");
	}
}
