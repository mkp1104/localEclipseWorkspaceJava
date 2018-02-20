package hibernate_part12;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class Manager 
{public static void main(String[] args) {
	

Configuration c=new Configuration().configure();
ServiceRegistry sr=new ServiceRegistryBuilder().applySettings(c.getProperties()).build();
SessionFactory sf=c.buildSessionFactory(sr);
Session s=sf.openSession();
Human2 h= new Human2();
h.setFirstName("manish");
h.setId(1);
h.setAge(22);
Person2 p=new Person2();
p.setAddress("Jalandhar");
p.setCity("Amritshar");
Employee2 e=new Employee2();
e.setDesignation("ABC");
e.setEmail("manish.212@hmail.com");
s.beginTransaction();
s.save(h);
s.save(p);
s.save(e);
s.getTransaction().commit();
System.out.println("done");
s.flush();
s.close();
}
}
