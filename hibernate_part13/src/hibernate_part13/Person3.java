package hibernate_part13;

import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.PrimaryKeyJoinColumn;
@Entity
@Table(name="Person3")
@PrimaryKeyJoinColumn(name="H_Id")
public class Person3 extends Human3
{
	@Column(name="address")	

	private String address;

	@Column(name="city")

	private String city;

	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
}
