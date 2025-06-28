package inheritance;
//inheritance with parameterized constructor
class parent_1{
	public parent_1(int a) {
		System.out.println("parent class." +a);
		
	}
	public parent_1(String a) {
		System.out.println("parent string class." +a);
	}
}

public class single_level_inheritance extends parent_1{
	public single_level_inheritance(int a) {
		//object calling
		child_1 c=new child_1(20);
		child_1 c1=new child_1("PHP")
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     }
	

	
		

	

}
