package studentManagement;

import java.util.ArrayList;

public class Student extends Person implements Interface {
	
	public Student(String fullname, String dateofbirth, String address, String phonenumber) {
		super(fullname, dateofbirth, address, phonenumber);
		// TODO Auto-generated constructor stub
	}


	public Student() {
		// TODO Auto-generated constructor stub
	}


	private String email;
	private String password;
	private int studentId;
	private int totalCredits;
	
	@Override
	public void studentRegistration(
			String fullName, 
			String dateOfBirth, 
			String address, 
			String phoneNumber,
			String email, 
			String password) {
		// TODO Auto-generated method stub
		this.email = email;
		this.password = password;
		
		super.setFullName(fullName);
		super.setDateOfBirth(dateOfBirth);
		super.setAddress(address);
		super.setPhoneNumber(phoneNumber);
		
		System.out.println("Student Plan Has Been Accepted");
		System.out.println("==============================");
		System.out.println("Data of Person : ");
		System.out.println("Full Name : " + super.getFullName());
		System.out.println("Date of Birth : " + super.getDateOfBirth() );
		System.out.println("Address : " + super.getAddress());
		System.out.println("Phone Number : " + super.getPhoneNumber());
		System.out.println("==============================");
		System.out.println("Student Data");
		System.out.println("Email : " + this.email);
		System.out.println("Student Id : " + "41416010017");
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPassword() {
		return password;
		
	}
	
	public void setPassword(String passsword) {
		this.password = password;
		
	}

	@Override
	public void learningPlan(ArrayList<CoursePlan> CoursePlan) {
		// TODO Auto-generated method stub
	
		for (CoursePlan cp : CoursePlan) {
			int credits = cp.getCredits();
			this.totalCredits += credits;
		}
		
		if (this.totalCredits >= 144) {
			super.setFullName(super.getFullName() + " S.T");
		}
		
		System.out.println("learning Plan Data");
		System.out.println("==================");
		System.out.println("Email : " + this.email);
		System.out.println("Student ID : " + "41416010017");
		System.out.println("Full Name : " + super.getFullName());
		System.out.println("Total Credits : " + this.totalCredits);
		
		for (CoursePlan cp : CoursePlan) {
			System.out.println("Course Name : " + cp.getCourseName());
			
		}
	}
	
	
	
	
	
	
}