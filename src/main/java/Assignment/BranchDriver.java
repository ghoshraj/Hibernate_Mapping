package Assignment;

import java.util.LinkedList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class BranchDriver {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Hospital h1 = new Hospital();
		h1.setName("RR");
		h1.setCEO("Rajesh");
		
		Branch b1 = new Branch();
		b1.setName("RR-Marathalli");
		b1.setManager("Deba");
		
		Branch b2 = new Branch();
		b2.setName("RR-Kolkata");
		b2.setManager("Animesh");
		
		Address a1 = new Address();
		a1.setCity("Hugli");
		a1.setLandmark("Near fruit Juice Bar");
		a1.setPincode(952152);
		
		Address a2 = new Address();
		a2.setCity("Bangalore");
		a2.setLandmark("Near KLM Mall");
		a2.setPincode(952152);
	
		Doctor d1 = new Doctor();
		d1.setName("Sandhita");
		d1.setSpecalization("Gynaecology");
		d1.setYOE(3);
		
		Doctor d2 = new Doctor();
		d2.setName("Subha");
		d2.setSpecalization("Surgery");
		d2.setYOE(5);
		
		Doctor d3 = new Doctor();
		d3.setName("Nabanita");
		d3.setSpecalization("Cardiology");
		d3.setYOE(2);
		
		Doctor d4 = new Doctor();
		d1.setName("Rumki");
		d1.setSpecalization("Neurology");
		d1.setYOE(4);
		
		Patient p1 = new Patient();
		p1.setName("Surojit");
		p1.setBg("O+");
		p1.setAge(22);
		p1.setWeight(58);
		
		Patient p2 = new Patient();
		p2.setName("Bibek");
		p2.setBg("O-");
		p2.setAge(25);
		p2.setWeight(78);
		
		Patient p3 = new Patient();
		p3.setName("Rahul");
		p3.setBg("O+");
		p3.setAge(22);
		p3.setWeight(58);
		
		Patient p4 = new Patient();
		p4.setName("Piysh");
		p4.setBg("O-");
		p4.setAge(23);
		p4.setWeight(65);
		
		Disease di1 = new Disease();
		di1.setName("Heart-Attack");
		di1.setFee(10000000); 
		
		Disease di2 = new Disease();
		di2.setName("Hepatitice C");
		di2.setFee(500000);
		
		Encounter e1 = new Encounter();
		e1.setName("Surojit");
		e1.setAge(22);
		e1.setSymptom("Heart-Attack");
		
		Encounter e2 = new Encounter();
		e2.setName("Bibek");
		e2.setAge(24);
		e2.setSymptom("Hepatitice C");
		
		Encounter e3 = new Encounter();
		e3.setName("Rahul");
		e3.setAge(22);
		e3.setSymptom("Hepatitice C");
		
		Encounter e4 = new Encounter();
		e4.setName("Piysh");
		e4.setAge(24);
		e4.setSymptom("Hepatitice C");


	
		//Branch2
		b1.setAddress(a2);
		b2.setAddress(a1);
		a1.setBranch(b2);
		a2.setBranch(b1);
		
		List<Doctor> doctors = new LinkedList<Doctor>();
		doctors.add(d1);
		doctors.add(d2);
		
		List<Doctor> doctors2 = new LinkedList<Doctor>();
		doctors2.add(d3);
		doctors2.add(d4);

		
		List<Patient>patients = new LinkedList<Patient>();
		patients.add(p1);
		patients.add(p2);
		
		List<Patient>patients2 = new LinkedList<Patient>();
		patients2.add(p3);
		patients2.add(p4);
		
		List<Encounter>encounters = new LinkedList<Encounter>();
		encounters.add(e1);
		encounters.add(e2);
		
		List<Encounter>encounters2 = new LinkedList<Encounter>();
		encounters2.add(e3);
		encounters2.add(e4);
		
		List<Disease>diseases = new LinkedList<Disease>();
		diseases.add(di1);
		diseases.add(di2);
		
		List<Branch>Branch2s = new LinkedList<Branch>();
		Branch2s.add(b1);
		Branch2s.add(b2);
		
		h1.setB(Branch2s);
		
		b1.setDoctors(doctors);
		b2.setDoctors(doctors2);
		
		b1.setPatients(patients);
		b2.setPatients(patients2);
		
		p1.setE(encounters);
		p2.setE(encounters2);
		
		p1.setD(diseases);
		p2.setD(diseases);
		
		di1.setP(patients);
		di2.setP(patients);
		
		
		
		et.begin();
		em.persist(h1);
		em.persist(b1);
		em.persist(b2);
		em.persist(a1);
		em.persist(a2);
		em.persist(d1);
		em.persist(d2);
		em.persist(d3);
		em.persist(d4);
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.persist(p4);		
		em.persist(di1);
		em.persist(di2);
		em.persist(e1);
		em.persist(e2);
		em.persist(e3);
		em.persist(e4);
		et.commit();
	}
}
