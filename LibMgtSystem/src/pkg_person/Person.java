package pkg_person;

import java.io.Serializable;
import java.util.regex.Pattern;

abstract public class Person implements Serializable {
	protected String name;
	protected String emailid;
	protected String phonenumber;
	protected String address;
	protected String dob;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		// Debugging output to check the name input and validation
		System.out.println("Setting name: " + name);
		boolean isValidName = Pattern.matches("^[a-zA-Z ]+$", name);
		if (isValidName) {
			this.name = name;
			System.out.println("Name is valid: " + this.name);
		} else {
			this.name = "default name";
			System.out.println("Name is invalid. Setting default name.");
		}
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		boolean isValidDob = Pattern.matches("\\d{2}-\\d{2}-\\d{4}", dob);
		if (isValidDob)
			this.dob = dob;
		else
			this.dob = "1-06-2012";
	}

	public Person(String name, String emailid, String phonenumber, String address, String dob) {
		super();
		this.setName(name); // Call setter for validation
		this.emailid = emailid;
		this.phonenumber = phonenumber;
		this.address = address;
		this.setDob(dob); // Call setter for validation
	}

	public Person() {
		super();
	}

}
