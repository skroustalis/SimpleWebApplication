package model;


import java.io.Serializable;
import java.sql.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column (name ="name")
	private String name;
	@Column (name ="surname")
	private String surname;
	@Column (name ="gender")
	private String gender;
	@Column (name ="birthdate")
	private Date birthdate;

	@OneToOne (cascade = CascadeType.ALL)
	@JoinColumn (name= "address_id")
	private Address address;
	
    public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
	
	@Override
	public String toString() {
		return "name "+ name + " surname " + surname + " gender " + gender + " birthdate " + birthdate + " work_address " +
	address.getWork_address() + " home_address " + address.getHome_address();
			
	}
  
}