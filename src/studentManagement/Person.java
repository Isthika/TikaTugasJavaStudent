package studentManagement;

//Parent
public class Person {
	private String fullName;
	private String dateOfBirth;
	private String address;
	private String phoneNumber;
	
	public Person(String fullname, String dateofbirth, String address, String phonenumber) {
		super();
		this.fullName = fullname;
		this.dateOfBirth = dateofbirth;
		this.address = address;
		this.phoneNumber = phonenumber;
	}
	
	public Person() {
		super();
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
