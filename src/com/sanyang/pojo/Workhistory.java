package com.sanyang.pojo;

public class Workhistory {
	private Integer hId;//	�������	number
	private String	changeDate;//	����ʱ��	date
	private String	result;//	����ԭ��	Varchar2(400)
	private String	deptName;//	����	Varchar2(40)
	private String	jobType;//	ְ��	Varchar2(40)
	private Integer	eno;//	����Ա��	number
	public Integer gethId() {
		return hId;
	}
	public void sethId(Integer hId) {
		this.hId = hId;
	}
	public String getChangeDate() {
		return changeDate;
	}
	public void setChangeDate(String changeDate) {
		this.changeDate = changeDate;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	public String getJobType() {
		return jobType;
	}
	public void setJobType(String jobType) {
		this.jobType = jobType;
	}
	public Integer getEno() {
		return eno;
	}
	public void setEno(Integer eno) {
		this.eno = eno;
	}
	@Override
	public String toString() {
		return "Workhistory [hId=" + hId + ", changeDate=" + changeDate + ", result=" + result + ", deptName="
				+ deptName + ", jobType=" + jobType + ", eno=" + eno + "]";
	}

	
}
