package hibernate_part13;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.PrimaryKeyJoinColumn;
@Entity
@Table(name="Employee3")
@PrimaryKeyJoinColumn(name="H-Id")
public class Employee3 extends Person3
{
	@Column(name="designation")
	
	private String designation;
	
	@Column(name="email")
	
	private String email;
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
