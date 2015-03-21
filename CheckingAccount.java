/*U10316035
 *Lin Tz Hau
 */
 
//The CheckingAccount class
 
import java.util.Scanner;
 
public class CheckingAccount 
		extends Account{
	Scanner input = new Scanner(System.in);
	//data field to store balance for savings account
	double newCheckingBalance = -5001;
	//data field to store monthly unterest rate for savings account
	double getCheckingMonthlyInterest;
	//no-arg constructor to inherit super class 
	CheckingAccount(){
		super();
	}
	//constructor with argument to inherit super class 
	CheckingAccount(int newCheckingId, double newCheckingBalance, double newCheckingAnnualInterestRate){
		super(newCheckingId, newCheckingBalance);
		super.setAnnualInterestRate(newCheckingAnnualInterestRate);
		super.getMonthlyInterestRate();
	}
	//accessor to get monthly interest 
	public double getCheckingMonthlyInterest(){
		getCheckingMonthlyInterest = super.getMonthlyInterest();
		return getCheckingMonthlyInterest;
	}
	//method to withdraw
	public void checkingWithdraw(int CheckingWithdraw){
		while(newCheckingBalance < -5000){
			super.withdraw(CheckingWithdraw);
			this.newCheckingBalance = super.getBalance();
			if(newCheckingBalance >= -5000)
				break;
			super.withdraw(-CheckingWithdraw);
			System.out.print("A checking account has an overdraft limit(-5000), withdraw again : ");
			CheckingWithdraw = input.nextInt();
			
		}
	}
	//method to deposit
	public void checkingDeposit(int CheckingDeposit){
		super.deposit(CheckingDeposit);
	}
	//toString() method
	@Override
	public String toString(){
		return super.toString();
	}
}
