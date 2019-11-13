package model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class DAO {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA");
	EntityManager em = emf.createEntityManager();
	public Student getSudentById(int id) {
		em.getTransaction().begin();
		Student std3 = em.find(Student.class, id);
		em.getTransaction().commit();

		return std3;
		}
	public void removeStudent(int id) {
		em.getTransaction().begin();
		Student student = em.find(Student.class, id);
	  em.remove(student);
		em.getTransaction().commit();		
	  System.out.println("Removed");
	}
	public void UpdateStudent(Student student) {
		em.getTransaction().begin();
		 em.merge(student);
			em.getTransaction().commit();

		 System.out.println("Updated");
	}
	public void addStudent(Student student) {
		em.getTransaction().begin();
		em.persist(student);
		em.getTransaction().commit();
		System.out.println("ADDED IN DATABASE BUDDY. CHILL");

	}
	
}
