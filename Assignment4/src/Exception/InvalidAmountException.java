package Exception;

public class InvalidAmountException extends BankAccountException {
	public InvalidAmountException(String message) {
		super(message);
	}

}