package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="addresses")
public class Address implements Serializable{
	private static final long serialVersionUID= 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int address_id;
	@Column (name ="work_address")
	private String work_address;
	@Column (name ="home_address")
	private String home_address;
	

	public String getWork_address() {
		return work_address;
	}
	public void setWork_address(String work_address) {
		this.work_address = work_address;
	}
	public String getHome_address() {
		return home_address;
	}
	public void setHome_address(String home_address) {
		this.home_address = home_address;
	}
	
	
}

