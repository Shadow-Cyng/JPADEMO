package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity(name="Student")
public class Student implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private int studentId;
private String name;
public Student() {
	super();
	// TODO Auto-generated constructor stub
}

public Student(String name) {
	super();
	this.name = name;
}

public Student(int studentId) {
	super();
	this.studentId = studentId;
}

public Student(int studentId, String name) {
	super();
	this.studentId = studentId;
	this.name = name;
}
public int getStudentId() {
	return studentId;
}
public void setStudentId(int studentId) {
	this.studentId = studentId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "Student [studentId=" + studentId + ", name=" + name + "]";
}

}
