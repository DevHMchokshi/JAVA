package inheritance;

class DEV{
	void display(String name) {
		System.out.println("display method of Admin_1:"+ name);
	}
}
class DEV_1 extends DEV{
	void display(String name) {
		super.display(name);//calls the parametized method of Admin_1
		System.out.println("display method of Admin_2:"+ name);
		
	}
}
class DEV_2 extends DEV{
	void display(String name) {
	super.display(name);	//calls the parametized method of Admin_1
	System.out.println("display method of Admin_3:"+ name);
	}
}

		
public class herrirechay_with_parameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DEV_2 DEV2= new DEV_2();
        DEV2.display("Dev");

        DEV DEV3 = new DEV();
        DEV3.display("Chokshi");
		
		
	}
}

