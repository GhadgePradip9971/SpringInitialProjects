package com.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Employeecontroller {
	@RequestMapping("/")
	public String EmpForm() {
		return "innovice";
	}

	@RequestMapping("/resultUrl")
	public String Employee(@RequestParam String eno, @RequestParam String ename, @RequestParam String esalary,
			ModelMap model) {
		model.put("k1", eno);
		model.put("k2", ename);
		model.put("k3", esalary);

		int empno = Integer.parseInt(eno);
		Double empSalary = Double.parseDouble(esalary);

		Double GrossSalary = 0.0;
		Double NetSalary = 0.0;
		Double TA = 0.0;
		Double DA = 0.0;
		Double HRA = 0.0;
		Double PF = 0.0;
		if (empSalary < 30000) {
			TA = empSalary * 0.07;
			DA = empSalary * 0.09;
			HRA = empSalary * 0.11;
			PF = empSalary * 0.15;

		} else if (empSalary >= 30000 && empSalary < 50000) {
			TA = empSalary * 0.12;
			DA = empSalary * 0.13;
			HRA = empSalary * 0.17;
			PF = empSalary * 0.22;

		} else if (empSalary >= 50000) {
			TA = empSalary * 0.17;
			DA = empSalary * 0.19;
			HRA = empSalary * 0.21;
			PF = empSalary * 0.25;

		}

		GrossSalary = empSalary + TA + DA + HRA - PF;
		NetSalary = empSalary + TA + DA + HRA + PF;

		model.put("TA", TA);
		model.put("DA", DA);
		model.put("HRA", HRA);
		model.put("PF", PF);
		model.put("GrossSalary", GrossSalary);
		model.put("NetSalary", NetSalary);
		return "result";
	}
}
