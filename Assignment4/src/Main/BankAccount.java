package Main;

import Exception.*;

class BankAccount {

	private String name; // your name
	private double balance; // current amount of money you save in the bank account
	private final static double depositLimit = 500;
	private final static double withdrawLimit = 500;

	/** constructor */
	public BankAccount(String name, double balance) {
		this.name = name;
		this.balance = balance;
	}

	/** constructor */
	public BankAccount(String name) {
		this(name, 0);
	}

	/** return balance */
	public double getbalance() {
		return balance;
	}

	/** return name */
	public String getName() {
		return name;
	}

	public String toString() {
		return "Name: " + name + "\n" + "Balance: " + balance;
	}

	/** deposit money into the account */
	public void deposit(double depositAmount) {
		try {
			if (depositAmount <= 0) {
				throw new InvalidAmountException("Deposit amount must be positive.");
			}
			if (depositAmount > depositLimit) {
				throw new DepositLimitException("Deposit amount exceeds the limit.");
			}
			balance += depositAmount;
			System.out.println("Deposit successful. New balance: " + balance);
		} catch (InvalidAmountException | DepositLimitException e) {
			System.out.println("Deposit failed: " + e.getMessage());
		}
	}

	/** withdraw money from the account */
	public void withdraw(double withdrawAmount) {
		try {
			if (withdrawAmount <= 0) {
				throw new InvalidAmountException("Withdrawal amount must be positive.");
			}
			if (withdrawAmount > withdrawLimit) {
				throw new WithdrawLimitException("Withdrawal amount exceeds the limit.");
			}
			if (withdrawAmount > balance) {
				throw new NotEnoughBalanceException("Not enough balance to withdraw.");
			}
			balance -= withdrawAmount;
			System.out.println("Withdrawal successful. New balance: " + balance);
		} catch (InvalidAmountException | WithdrawLimitException | NotEnoughBalanceException e) {
			System.out.println("Withdrawal failed: " + e.getMessage());
		}
	}
}