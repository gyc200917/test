package com.sanyang.pojo;

public class Employee {


	private Integer eno;//	���	number
	private String empNum;//	Ա�����	Varchar2(40)
	private String idCard;//	���֤��	Varchar2(40)
	private String empName;//	Ա������	Varchar2(40)
	private String graduate;//	��ҵѧУ	Varchar2(40)
	private String lastEducation;//	���ѧ��	Varchar2(40)
	public Integer getEno() {
		return eno;
	}
	public void setEno(Integer eno) {
		this.eno = eno;
	}
	public String getEmpNum() {
		return empNum;
	}
	public void setEmpNum(String empNum) {
		this.empNum = empNum;
	}
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getGraduate() {
		return graduate;
	}
	public void setGraduate(String graduate) {
		this.graduate = graduate;
	}
	public String getLastEducation() {
		return lastEducation;
	}
	public void setLastEducation(String lastEducation) {
		this.lastEducation = lastEducation;
	}
	public String getIdCard() {
		return idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", empNum=" + empNum + ", idCard=" + idCard + ", empName=" + empName
				+ ", graduate=" + graduate + ", lastEducation=" + lastEducation + "]";
	}
	
	
	
}
