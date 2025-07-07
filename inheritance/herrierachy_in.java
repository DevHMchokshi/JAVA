package inheritance;
class Admin_1{
	void display() {
		System.out.println("display method of Admin_1");
	}
	
}
class Admin_2 extends Admin_1{
	void display() {
		super.display(); //calls the display method of Admin_2
		System.out.println("display method of Admin_2");
	}
}
class Admin_3 extends Admin_1{
	void display(){
		super.display(); //calls the display method of Admin_3
		System.out.println("display method of Admin_3");
	}		
}
public class herrierachy_in {
public static void main(String[] args) {
	Admin_2 admin2 = new Admin_2();
	admin2.display();
	Admin_3 admin3 = new Admin_3();
	admin3.display();
		// TODO Auto-generated method stub

	}

}
