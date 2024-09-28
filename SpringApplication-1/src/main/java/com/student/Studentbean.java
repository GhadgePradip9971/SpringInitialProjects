package com.student;

public class Studentbean {
	private int stdid;
	private String stdname;
	private double stdfee;
	private int s1m;
	private int s2m;
	private int s3m;

	public Studentbean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getStdid() {
		return stdid;
	}

	public void setStdid(int stdid) {
		this.stdid = stdid;
	}

	public String getStdname() {
		return stdname;
	}

	public void setStdname(String stdname) {
		this.stdname = stdname;
	}

	public double getStdfee() {
		return stdfee;
	}

	public void setStdfee(double stdfee) {
		this.stdfee = stdfee;
	}

	public int getS1m() {
		return s1m;
	}

	public void setS1m(int s1m) {
		this.s1m = s1m;
	}

	public int getS2m() {
		return s2m;
	}

	public void setS2m(int s2m) {
		this.s2m = s2m;
	}

	public int getS3m() {
		return s3m;
	}

	public void setS3m(int s3m) {
		this.s3m = s3m;
	}

	public void printDetails() {

		int totalMarks = s1m + s2m + s3m;
		double average = totalMarks / 3.0;

		System.out.println("Student ID: " + stdid);
		System.out.println("Student Name: " + stdname);
		System.out.println("Student Fee: " + stdfee);
		System.out.println("Subject 1 Marks: " + s1m);
		System.out.println("Subject 2 Marks: " + s2m);
		System.out.println("Subject 3 Marks: " + s3m);
		System.out.println("Total Marks: " + totalMarks);
		System.out.println("Average Marks: " + average);

		if (average >= 90) {
			System.out.println("Grade: A");
		} else if (average >= 80) {
			System.out.println("Grade: B");
		} else if (average >= 70) {
			System.out.println("Grade: C");
		} else if (average >= 60) {
			System.out.println("Grade: D");
		} else {
			System.out.println("Grade: F");
		}

	}

}
