package hibernate_part12;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class Manager1 
{
	public static void main(String[] args) {
	

Configuration c=new Configuration().configure();
ServiceRegistry sr=new ServiceRegistryBuilder().applySettings(c.getProperties()).build();
SessionFactory sf=c.buildSessionFactory(sr);
Session s=sf.openSession();
Human2 h= (Human2)s.load(Human2.class, 4);
System.out.println(h.getFirstName());
System.out.println(h.getAge());
Person2 p=(Person2)s.load(Person2.class,5);
System.out.println(p.getAddress());
System.out.println(p.getCity());

Employee2 e=(Employee2)s.load(Employee2.class,6);
System.out.println(e.getDesignation());
System.out.println(e.getEmail());
System.out.println("done");

s.flush();
s.close();
}
}
