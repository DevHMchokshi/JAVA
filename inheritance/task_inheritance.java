package inheritance;
class employee{
	int salary;
	int id;
	int name;
	void display(int salary,int id, String name) {
		this.id=id;
		this.name=salary;
		this.salary=salary;
		System.out.println("emplyoee class details are :");
		System.out.println("ID :: " + 1);
		System.out.println("" + "Name :: " + "Raju");
		System.out.println("" + "Salary :: " + 5000000);	
	}
}
class Manager1 extends employee{
	int teamsize;
	void display(int id,String name,int salary) {
		System.out.println("\n" + "Manager class details are :");
		System.out.println("Team size: " + 10);
		System.out.println("ID: " + 2);
		System.out.println("Name :: " + "Dev");
		System.out.println("" + "Salary ::" + 16000000);		
	}
}
class HR1 extends Manager1{
String department = "IT";
void display(int id,String name, int salary) {
super.display(id,name,salary);
System.out.println("HR class details are :");
System.out.println("department : "+ department);
System.out.println("" + "ID :: " + id);
System.out.println("Name :: " + name);
System.out.println("" + "Salary :: " + salary);
   }
}

public class task_inheritance {
public static void main(String[] args) {
		// TODO Auto-generated method stub
	    HR1 hr = new HR1();
	    hr.display(3,"ramu",85000);
	}
}
