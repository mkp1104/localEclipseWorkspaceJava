import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Manager {
	public static void main(String[] args) 
	{
	ApplicationContext c=new ClassPathXmlApplicationContext("config.xml");//here itself Object of Person And Bean-Factory is created..i.e=setter is getting initialized with default value..
	System.out.println("done0");
	//Hello h=(Hello)c.getBean("h");
	Hello h=(Hello)c.getBean("h");
	
	System.out.println("done1");
	//System.out.println("Name : "+h.getPar1());
	System.out.println("Name : "+h.getPar1());
	Hello h1=(Hello)c.getBean("h1");
	System.out.println("Name : "+h1.getPar1());
	
	}

}