package hibernate_part13;
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
Human3 h= new Human3();
h.setAge(22);
h.setFirstName("manish");
h.setId(1);

Person3 p=new Person3();
p.setAddress("Jalandhar");
p.setCity("Amritshar");
Employee3 e1=new Employee3();
e1.setDesignation("adsasa");
e1.setEmail("manish@m");
s.beginTransaction();
s.save(h);
s.save(p);
s.save(e1);
s.getTransaction().commit();
System.out.println("done");
s.flush();
s.close();
}
}