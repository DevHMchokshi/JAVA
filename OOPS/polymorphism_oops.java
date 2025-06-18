package OOPS;

//compile time polymorphism



//run time polymorphism

//method overloading -> same method name with different parameters

//method overriding -> same method name in parent and child class



public class polymorphism_oops {

	int balance;



	void deposit(int amount) {

		balance += amount;

		System.out.println("Deposited: " + amount);

		System.out.println(getbalance());

	}



	void deposit(int amount, String name) {

		balance += amount;

		System.out.println("Deposited: " + amount + " by " + name);

		System.out.println(getbalance());

	}



	void deposit(int amount, String name, String bankName) {

		balance += amount;

		System.out.println("Deposited: " + amount + " by " + name + " in " + bankName);

		System.out.println(getbalance());

	}



	void deposit(int amount, String name, String bankName, String branch) {

		balance += amount;

		System.out.println("Deposited: " + amount + " by " + name + " in " + bankName + ", " + branch);

		System.out.println(getbalance());

	}



	void deposit(int amount, double consverionRate) {

		balance += amount;

		double convertedAmount = amount * consverionRate;

		System.out.println("Deposited: " + amount + consverionRate + " converted to " + convertedAmount);

	}



	public int getbalance() {

		return balance;

	}



	public static void main(String[] args) {

		// TODO Auto-generated method stub

		polymorphism_oops p = new polymorphism_oops();

		p.deposit(1000);

		p.deposit(2000, "DEV");

		p.deposit(3000, "DEV", "HDFC");

		p.deposit(4000, "DEV", "HDFC", "BARODA");

		p.deposit(5000, 0.012); // Example with conversion rate

		int currentBalance = p.getbalance();

		System.out.println("Current Balance: " + currentBalance);

	}

}

