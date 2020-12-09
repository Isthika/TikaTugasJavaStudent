package studentManagement;

public class CoursePlan {

	private String major;
	private String courseName;
	private String lecturer;
	private int credits;
	private int roomNumber;
	
	public CoursePlan(String major, String courseName, String lecturer, int credits, int roomNumber) {
		this.major = major;
		this.courseName = courseName;
		this.lecturer = lecturer;
		this.credits = credits;
		this.roomNumber = roomNumber;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getLecturer() {
		return lecturer;
	}

	public void setLecturer(String lecturer) {
		this.lecturer = lecturer;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
}

