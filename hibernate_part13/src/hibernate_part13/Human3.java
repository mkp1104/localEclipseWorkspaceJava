package hibernate_part13;
import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Id;

@Entity
@Table(name="Human3")
@Inheritance(strategy=InheritanceType.JOINED)
public class Human3 
{
@Id
@GeneratedValue
@Column(name="H_Id")
private int id;

@Column(name="firstName")

private String firstName;

@Column(name="age")

private int age;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
}
