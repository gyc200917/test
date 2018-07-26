package com.sanyang.dao;

import java.util.List;

import com.sanyang.pojo.Employee;
import com.sanyang.pojo.Workhistory;

public interface EmpDao {

	/**
	 * 查询全部员工
	 * @return
	 */
	public List<Employee> getAllEmp();
	
	/**
	 * 
	 * 添加
	 * @param workhistory
	 */
	public void addWork(Workhistory workhistory);
	
	/**
	 * 查询调动历史
	 * @return
	 */
	public List<Workhistory> getAllWork(Integer eno);

}