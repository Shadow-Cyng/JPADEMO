package model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class StudentMain {

	public static void main(String[] args) {
	DAO dao=new DAO();
//	dao.removeStudent(1);
	Student std2=new Student(4,"SINGHANIA");
	dao.UpdateStudent(std2);
		
		
		}
		
		
	}


