package studentManagement;

import java.util.ArrayList;

public class MainStudent {

	public static void main(String[] args) {
		
		Student student1 = new Student();
		student1.studentRegistration("Isthika Drawina Putri Laksana", "29 April 1998", "Jakarta", "0878********", "Isthika@gmail.com", "abc1234");
		
		CoursePlan coursePlan1 = new CoursePlan("Electrical", "Basic Electrical", "Abah", 100, 301 );
		CoursePlan coursePlan2 = new CoursePlan("Electrical", "Computer Program", "Zenzen", 44, 301);
				
		ArrayList<CoursePlan> coursePlanList = new ArrayList<>();
		coursePlanList.add(coursePlan1);
		coursePlanList.add(coursePlan2);
		
		System.out.println("****************************");
		System.out.println("");
		System.out.println("****************************");
		
		student1.learningPlan(coursePlanList);
	}
}
