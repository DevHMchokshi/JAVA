package OOPS;
class Student_grade_system{

	double avg;
	int total_marks;
	String grade;
	//method takes marks of 1 student
	void Calculate_avg(int marks1) {
		System.out.println("total marks of student is : " + marks1+"avg is : " + marks1/1);
	//call grade method			
	}
	//method takes marks of 2 students
	void Calculate_avg(int marks1, int marks2) {
		total_marks = marks1 + marks2;
		avg = total_marks / 2.0;
		System.out.println("total marks of students is : " + total_marks + " avg is : " + avg);
		
	}
	     //call grade method 
	
	//method takes marks of 3 students
	//method takes marks of 4 students
	//method takes marks of 5 students
	


//make a method to calculate grade based on average
	
void Calculate_grade() {
	if(avg > 90) {
		grade ="A";
		System.out.println(grade);
	} else if(avg >= 80 && avg < 90) {
		grade ="B";
		System.out.println(grade);
	} else if(avg >= 70 && avg < 80) {
		grade ="C";
		System.out.println(grade);
	} else if(avg >= 60 && avg < 70) {
		grade ="D";
		System.out.println(grade);
	} else if(avg >= 50 && avg < 60) {
		grade ="E";
				
	}
		
	}
}
	

public class polymorphism_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
