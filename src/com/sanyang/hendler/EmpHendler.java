package com.sanyang.hendler;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sanyang.dao.EmpDao;
import com.sanyang.pojo.Employee;
import com.sanyang.pojo.Workhistory;

@Controller
public class EmpHendler {

	@Autowired
	private EmpDao dao;
	
	@RequestMapping("/getAllEmp")
	public String getAllEmp(Map<String, Object> map) {
		List<Employee> allEmp = dao.getAllEmp();
		map.put("allEmp", allEmp);	
		return "list";
	}
	
	@RequestMapping("/add")
	public String add(Map<String, Object> map,Employee employee) {
		map.put("eno", employee.getEno());
//		System.out.println(employee.getEno());
		return "add";
	}
	
	@RequestMapping("/addWork")
	public String addWork(Workhistory workhistory) {

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		String format = simpleDateFormat.format(new Date());
		workhistory.setChangeDate(format);
//		System.out.println(workhistory.getEno());
//		System.out.println(workhistory.getChangeDate());
		dao.addWork(workhistory);
		
		return "redirect:getAllEmp.gyc";
	}
	
	@RequestMapping("/getAllWork")
	public String getAllWork(Map<String, Object> map,Employee employee) {

		List<Workhistory> allWork = dao.getAllWork(employee.getEno());
		map.put("allWork", allWork);
		return "list2";
	}

	
}
