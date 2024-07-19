package Assignment;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Doctor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String specalization;
	private int YOE;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpecalization() {
		return specalization;
	}
	public void setSpecalization(String specalization) {
		this.specalization = specalization;
	}
	public int getYOE() {
		return YOE;
	}
	public void setYOE(int yOE) {
		YOE = yOE;
	}

}
