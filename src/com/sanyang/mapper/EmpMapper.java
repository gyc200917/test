package com.sanyang.mapper;

import java.util.List;

import com.sanyang.pojo.Employee;
import com.sanyang.pojo.Workhistory;

public interface EmpMapper {
    
	/**
	 * ��ѯȫ��Ա��
	 * @return
	 */
	public List<Employee> getAllEmp();
	
	/**
	 * 
	 * ���
	 * @param workhistory
	 */
	public void addWork(Workhistory workhistory);
	
	/**
	 * ��ѯ������ʷ
	 * @return
	 */
	public List<Workhistory> getAllWork(Integer eno);
	

}
