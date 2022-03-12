package banking;

/**
 *
 * Private Variables:<br>
 * {@link #accountNumber}: Long<br>
 * {@link #bank}: Bank<br>
 */
public class Transaction {
	private Long accountNumber;
	private Bank bank;

	/**
	 *
	 * @param bank
	 *            The bank where the account is housed.
	 * @param accountNumber
	 *            The customer's account number.
	 * @param attemptedPin
	 *            The PIN entered by the customer.
	 * @throws Exception
	 *             Account validation failed.
	 */
	public Transaction(Bank bank, Long accountNumber, int attemptedPin) throws Exception {
		// complete the function
		var accounts=bank.accounts;
		var account=accounts.get(accountNumber);
		if (account.validatePin(attemptedPin))
		{
			this.accountNumber=accountNumber;
			this.bank=bank;
		}
		else
		{
			throw new Exception("Invalid Pin");
		}
	}

	public double getBalance() {
		// complete the function
		var account= bank.accounts.get(accountNumber);
        return account.balance;
	}

	public void credit(double amount) {
		// complete the function
		var account= bank.accounts.get(accountNumber);
		account.creditAccount(amount);
	}

	public boolean debit(double amount) {
		// complete the function
		var account = bank.accounts.get(accountNumber);
		return account.debitAccount(amount);
	}
}
