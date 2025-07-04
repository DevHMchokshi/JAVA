package inheritance;
class parent

{

	int id=10;

	public parent()

	{

		System.out.println("Parent class : "+id);

	}

}

class child extends parent

{

	public child()

	{

		System.out.println("Child class : "+id);

	}

}

public class single_level_inheritance {

	public static void main(String[] args) {

		new child();

	}

}


		

	


