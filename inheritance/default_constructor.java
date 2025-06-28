package inheritance;

class parent{
	parent(){
		System.out.println("parent class");
	}
}

class child extends parent{
	child(){
		  System.out.println("child class");
	}
}
public class default_constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//
		new child();

	}

}
