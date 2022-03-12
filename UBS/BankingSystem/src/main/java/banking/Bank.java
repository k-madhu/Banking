package banking;

import java.util.LinkedHashMap;

/**
 * Private Variables:<br>
 * {@link #accounts}: List&lt;Long, Account&gt;
 */
public class Bank implements BankInterface {
	private LinkedHashMap<Long, Account> accounts;

	public Bank() {
		// complete the function
		this.accounts = new LinkedHashMap<Long, Account>();
	}

	private Account getAccount(Long accountNumber) {
		// complete the function
        return this.accounts.get(accountNumber);
	}

	public Long openCommercialAccount(Company company, int pin, double startingDeposit) {
		// complete the function
		var accounts=new ArrayList<Integer>(accounts.keySet());
		long newAccountNumber=accounts.get(accounts.size() - 1)) + 1;
		var commercial=new CommercialAccount(company, newAccountNumber, pin, startingDeposit);
        return newAccountNumber;
	}

	public Long openConsumerAccount(Person person, int pin, double startingDeposit) {
		// complete the function
		var accounts=new ArrayList<Integer>(accounts.keySet());
		long newAccountNumber=accounts.get(accounts.size() - 1)) + 1;
		var commercial=new ConsumerAccount(person, newAccountNumber, pin, startingDeposit);
		return newAccountNumber;
	}

	public boolean authenticateUser(Long accountNumber, int pin) {
		// complete the function
		var account = accounts.get(accountNumber);
        return account.pin == pin;
	}

	public double getBalance(Long accountNumber) {
		// complete the function
		var account = accounts.get(accountNumber);
        return account.getBalance();
	}

	public void credit(Long accountNumber, double amount) {
		// complete the function
		var account = accounts.get(accountNumber);
		account.creditAccount(amount);
	}

	public boolean debit(Long accountNumber, double amount) {
		// complete the function
		var account = accounts.get(accountNumber);
        return account.debitAccount(amount);
	}
}
