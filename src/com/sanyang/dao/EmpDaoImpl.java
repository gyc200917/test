package com.sanyang.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sanyang.mapper.EmpMapper;
import com.sanyang.pojo.Employee;
import com.sanyang.pojo.Workhistory;

@Repository("dao")
public class EmpDaoImpl implements EmpDao {

	@Autowired
	private EmpMapper mapper;
	
	@Override
	public List<Employee> getAllEmp() {
		// TODO Auto-generated method stub
		return mapper.getAllEmp();
	}

	@Override
	public void addWork(Workhistory workhistory) {
		// TODO Auto-generated method stub
		mapper.addWork(workhistory);
	}

	@Override
	public List<Workhistory> getAllWork(Integer eno) {
		// TODO Auto-generated method stub
		return mapper.getAllWork(eno);
	}



}
