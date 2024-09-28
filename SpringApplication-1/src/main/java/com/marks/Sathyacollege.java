package com.marks;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Sathyacollege {
	private List<String> StudentNames;
	private Set<Integer> RollNos;
	private Map<String, Integer> Branchdetails;
	private Properties Branchinfos;

	public Sathyacollege() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<String> getStudentNames() {
		return StudentNames;
	}

	public void setStudentNames(List<String> studentNames) {
		StudentNames = studentNames;
	}

	public Set<Integer> getRollNos() {
		return RollNos;
	}

	public void setRollNos(Set<Integer> rollNos) {
		RollNos = rollNos;
	}

	public Map<String, Integer> getBranchdetails() {
		return Branchdetails;
	}

	public void setBranchdetails(Map<String, Integer> branchdetails) {
		Branchdetails = branchdetails;
	}

	public Properties getBranchinfos() {
		return Branchinfos;
	}

	public void setBranchinfos(Properties branchinfos) {
		Branchinfos = branchinfos;
	}

	public void printStudentNames() {
		System.out.println("=======StudentNames========");
		for (String StudentName : StudentNames) {
			System.out.println(StudentName);
		}

	}

	public void printRollNos() {
		System.out.println("====RollNos====");
		for (Integer RollNo : RollNos) {
			System.out.println(RollNo);
		}
	}

	public void printBranchdetails() {
		System.out.println("=====Branchdetails======");
		for (Map.Entry<String, Integer> Entry : Branchdetails.entrySet()) {
			System.out.println(Entry.getKey() + "\t" + Entry.getValue());
		}
	}

	public void printBranchinfos() {
		System.out.println("====Branchinfos=====");
		Set<String> keys = Branchinfos.stringPropertyNames();
		for (String key : keys) {
			System.out.println(key + "---" + Branchinfos.getProperty(key));
		}
	}

}
