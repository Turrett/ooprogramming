package Ereditarieta_Bank;

public class FeeAccount extends Account {

	public FeeAccount(String name, double amount) {
		super(name, amount);
	}

	@Override
	public double deposit(double n) {
		amount += n;
		return amount;
	}

	@Override
	public double withdraw(double n) {
		amount -= amount * FEE;
		amount -= n;
		return amount;
	}

}
