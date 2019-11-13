package model;

import javax.persistence.Entity;

public class Accounts {
	@Entity
	private long accno;
	private String name;
	
	private Login login = new Login();

	public Accounts() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Accounts(long accno, String name, Login login) {
		super();
		this.accno = accno;
		this.name = name;
		this.login = login;
	}

	public long getAccno() {
		return accno;
	}

	public void setAccno(long accno) {
		this.accno = accno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	@Override
	public String toString() {
		return "Accounts [accno=" + accno + ", name=" + name + ", login=" + login + "]";
	}
	
	

}
