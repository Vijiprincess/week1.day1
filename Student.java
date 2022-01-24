package week1.day1;

public class Student {
	
	String Studentname ="lakshitha";
	int rollno = 6;

	public void showcollege() {
		 String name = "Pondicherry university";
		 System.out.println("The name of the college is"+ name);
	}
	public static void main (String[] args) {
		Student L = new Student();
		System.out.println("The roll number of the student is"+ L.rollno);
		System.out.println("The name of the student is "+ L.Studentname);
		L.showcollege();
	}
		
		
		
		// TODO Auto-generated method stub

	}


