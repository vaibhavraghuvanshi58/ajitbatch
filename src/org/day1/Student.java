package org.day1;

public class Student {
	// States
	String StudentName;
	String Branch;
	int Marks;
	int Year;
	String DateOfBirth;
	
	// Behaviour
	public void changeName(String chnaedName){
		StudentName = chnaedName;
	}
	public void add10inMarks(){
		Marks = Marks + 10;	
	}
	public void takeExam(){
		
	}
}

class StudentDemo{
	public static void main(String[] args) {
		Student st1 = new Student();
		st1.StudentName = "Alia";
		st1.DateOfBirth = "asdf";
		st1.Marks = 15;
		
		
		System.out.println(st1.Marks);
		System.out.println(st1.StudentName);
		st1.add10inMarks();
		st1.changeName("Dipika");
		System.out.println(st1.Marks);
		System.out.println(st1.StudentName);
		
//		Student st3 = new Student();
//		st3.StudentName = "Katrina";
//		st3.DateOfBirth = "12-12-19";

	}
}
