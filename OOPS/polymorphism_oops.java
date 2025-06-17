package OOPS;
//compile time polymorphism
//runtime polymorphism

//method overloading->same method name with different parameter 
//method overriding ->same method name in parent and child class
public class polymorphism_oops {
int balance;

void deposit(int amount) {
	balance += amount;
	System.out.println(" deposited by " + amount);
	System.out.println(getBalance());
}
void deposit(int amount,String name ) {
	balance += amount;
	System.out.println(amount + " deposited by " + name);
}
void deposit(int amount, String name, String bankname);



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
