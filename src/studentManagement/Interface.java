package studentManagement;

import java.util.ArrayList;

public interface Interface {
	
	public void studentRegistration(
			String fullName,
			String dateOfBirth,
			String address,
			String phoneNumber,
			String email,
			String password);
	
	public void learningPlan(ArrayList<CoursePlan> CoursePlan);
}
