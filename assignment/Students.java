package week3.assignment;

public class Students {
	public void getStudentInfo(int x) {
		System.out.println("Student Id is " +x);
		
	}
	public void getStudentInfo(int y, String name) {
		System.out.println("Student Id is " +y);
		System.out.println("Student name is " +name);
		
	}
	public void getStudentInfo(String email, String phone) {
		System.out.println("Student email id is " +email);
		System.out.println("Student phone number is " +phone);
		
	}
	

	public static void main(String[] args) {
		Students s=new Students();
		s.getStudentInfo(1423);
		s.getStudentInfo(1629, "Pranithi");
		s.getStudentInfo("prani29@gmail.com", "9623456909");
		
		

	}

}
