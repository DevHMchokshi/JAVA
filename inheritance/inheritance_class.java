package inheritance;                                                                                                                                                                                          

import java.util.Scanner;

abstract class Admin{
	int size;
	Scanner scn=new Scanner(System.in);
	int id[];
	String name[];
	public Admin() {
		System.out.println("enter num of array elements");
		size=scn.nextInt();
		id=new int[size];
		name=new String[size];
		System.out.println("enter id and numbers of manager");
		for(int i=0;i<size;i++) {
			id[i]=scn.nextInt();
			name[i]=scn.next();
}
}

 void display() {
System.out.println("" + "Admin details");
for(int i=0;i<size;i++) {
	System.out.println(id[i]+" "+name[i]);
}
 }	
}
class Manager extends Admin{
	int id[];
	String name[];
	private int i;

    public Manager() {
    	System.out.println("enter id and name of manager");
    	id=new int[size];
    	name=new String[size];
    	for(int i = 0;i<size;i++) {
    		id[i]=scn.nextInt();
    		name[i]=scn.next();
    	}
    	}
    
      
void display() {
	super.display();
	System.out.println("manager details");
	for(int i=0;i<size;i++);
	System.out.println(id[i]+" "+name[i]);
	
}
//call adimn's display method
	
}
class Employee extends Manager{
	int id[];
	String name[];
	
	public Employee() {
		id = new int[size];
		name = new String[size];
		System.out.println("size , id and name of employee");
		for(int  i=0;i<size;i++) {
			id[i]=scn.nextInt();
			name[i]=scn.next();
		}
		
	}
	void dislay() {
		super.display();
		System.out.println("employee details");
		for(int i=0;i<size;i++) {
			System.out.println("id :"+ id[i] +"\t" + "name " + name[i]);
		}
	}
}

public class inheritance_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		emp.display();

	}

}
