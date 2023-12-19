package Main;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccount b1 = new BankAccount("Josephine Regal", 75000);
		BankAccount b2 = new BankAccount("Alphonse Robert", 400);
		System.out.println(b1);
		System.out.println();
		b1.deposit(-700);
		b1.withdraw(-450);
		b1.deposit(250);
		b1.withdraw(300);
		b1.deposit(0);
		b1.withdraw(475.98);
		System.out.println();
		System.out.println(b1);
		System.out.println("=============");
		System.out.println(b2);
		System.out.println();
		b2.deposit(-700);
		b2.withdraw(-450);
		b2.withdraw(150);
		b2.withdraw(300);
		b2.deposit(500);
		b1.deposit(0);
		System.out.println();
		System.out.println(b2);
	}

}
