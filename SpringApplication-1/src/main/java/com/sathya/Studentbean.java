package com.sathya;

public class Studentbean {
	private int studId;
	private String stdname;
	private String course;
	private double fee;

	public Studentbean() {
		super();
	}

	public int getStudId() {
		return studId;
	}

	public void setStudId(int studId) {
		this.studId = studId;
	}

	public String getStdname() {
		return stdname;
	}

	public void setStdname(String stdname) {
		this.stdname = stdname;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public void printStudent() {

		System.out.println("Student id" + studId);
		System.out.println("Student name" + stdname);
		System.out.println("Student course" + course);
		System.out.println("Student fee" + fee);

	}

}
