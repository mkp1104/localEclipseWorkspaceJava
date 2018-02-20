import java.util.*;

class SystemPropertiesDemo
{
	public static void main(String[] args)
	{
		String preferredLang = System.getProperty("lang");
		System.out.println("Your preferred language for communication : " + preferredLang);
	}
}
    

