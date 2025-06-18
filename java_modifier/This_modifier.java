package java_modifier;

//this keyword is used to refer current class properties
//methods and constructors and variable
//this is used to pass local variable to instance/global variable
public class This_modifier {
	int a;
	String name ;
	This_modifier(int a,String name )
	{
		this.a=a;
		this.name=name;
		System.out.println(a+"  "+name);
		
	}
	void display() {
		System.out.println(a+"  "+name);
	}
public static void main(String[] args) {
	
	This_modifier t=new This_modifier(10,"java");
	t.display();
	
	
		// TODO Auto-generated method stub

}
}
