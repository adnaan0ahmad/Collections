package com.java.treeSet;


@SuppressWarnings("rawtypes")
public class Employee implements Comparable {
	
	String EmpFName;
	String EmpLName;
	int EmpId;
	long EmpSal;
	int EmpAge;
	public Employee(String empFName, String empLName, int empId, long empSal, int empAge) {
		super();
		EmpFName = empFName;
		EmpLName = empLName;
		EmpId = empId;
		EmpSal = empSal;
		EmpAge = empAge;
	}
	@Override
	public String toString() {
		return "Employee [EmpFName=" + EmpFName + ", EmpLName=" + EmpLName + ", EmpId=" + EmpId + ", EmpSal=" + EmpSal
				+ ", EmpAge=" + EmpAge + "]";
	}
	public String getEmpFName() {
		return EmpFName;
	}
	public void setEmpFName(String empFName) {
		EmpFName = empFName;
	}
	public String getEmpLName() {
		return EmpLName;
	}
	public void setEmpLName(String empLName) {
		EmpLName = empLName;
	}
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	public long getEmpSal() {
		return EmpSal;
	}
	public void setEmpSal(long empSal) {								
		EmpSal = empSal;
	}
	public int getEmpAge() {
		return EmpAge;
	}
	public void setEmpAge(int empAge) {
		EmpAge = empAge;
	}
	
	@Override
	public int compareTo(Object o) {
		Employee e = (Employee) o;
		if (this.EmpSal<e.EmpSal)
			return -1;
		else if (this.EmpSal>e.EmpSal)
			return 1;
		else
			return 0;
	}
}