/*U10316035
 *Lin Tz Hau
 */
 
//The SavingsAccount class
 
import java.util.Scanner;
 
public class SavingsAccount 
		extends Account{
	Scanner input = new Scanner(System.in);
	//data field to store balance for savings account
	double newSavingsBalance = -1;
	//data field to store monthly unterest rate for savings account
	double savingsMonthlyInterestRate;
	//no-arg constructor to inherit super class 
	SavingsAccount(){
		super();
	}
	//constructor with argument to inherit super class 
	SavingsAccount(int newSavingsId, double newSavingsBalance, double newSavingsAnnualInterestRate){
		super(newSavingsId, newSavingsBalance);
		super.setAnnualInterestRate(newSavingsAnnualInterestRate);
		super.getMonthlyInterestRate();
	}
	//accessor to get monthly interest 
	public double getSavingsMonthlyInterest(){
		savingsMonthlyInterestRate = super.getMonthlyInterest();
		return savingsMonthlyInterestRate;
	}
	//method to withdraw
	public void savingsWithdraw(int savingsWithdraw){
		while(newSavingsBalance < 0){
			super.withdraw(savingsWithdraw);
			this.newSavingsBalance = super.getBalance();
			if(newSavingsBalance >= 0)
				break;
			super.withdraw(-savingsWithdraw);
			System.out.print("A savings account cannot be overdrawn, withdraw again : ");
			savingsWithdraw = input.nextInt();
		}
	}
	//method to deposit
	public void savingsDeposit(int savingsDeposit){
		super.deposit(savingsDeposit);
	}
	//toString() method
	@Override
	public String toString(){
		return super.toString();
	}
}
