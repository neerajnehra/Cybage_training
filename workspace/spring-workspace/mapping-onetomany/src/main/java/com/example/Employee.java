package com.example;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Employee {
	
	@Id				//This will be primary key in database
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int empId;
	private String empName;
	
	@OneToMany(targetEntity = Account.class,
			cascade = CascadeType.ALL,
			fetch = FetchType.LAZY
			)
	@JoinColumn(name = "ea_fk" , referencedColumnName = "empId")
	private List<Account> account;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int empId, String empName, List<Account> account) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.account = account;
	}
	public Employee(String empName, List<Account> account) {
		super();
		this.empName = empName;
		this.account = account;
	}


	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public List<Account> getAccount() {
		return account;
	}

	public void setAccount(List<Account> account) {
		this.account = account;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", account=" + account + "]";
	}

	
}
