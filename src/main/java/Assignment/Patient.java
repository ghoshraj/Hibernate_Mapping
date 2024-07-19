package Assignment;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Patient {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String bg;
	private int age;
	private int weight;
	
	@ManyToMany
	private List<Disease>d;
	
	@OneToMany
	private List<Encounter>e;

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

	public String getBg() {
		return bg;
	}

	public void setBg(String bg) {
		this.bg = bg;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public List<Disease> getD() {
		return d;
	}

	public void setD(List<Disease> d) {
		this.d = d;
	}

	public List<Encounter> getE() {
		return e;
	}

	public void setE(List<Encounter> e) {
		this.e = e;
	}
	
	
}
