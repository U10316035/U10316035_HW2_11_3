/*U10316035
 *Lin Tz Hau
 */
 
//The testAccount class

import java.util.Scanner;

public class testAccount{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int testId;
		double testBalance;
		double testAnnualInterestRate;
		int testWithdraw;
		int testDeposit;
		/*the default account that 8.6 asked*/
		System.out.println("Account---------------------------------");
		//create a default object
		Account defaultAccount1 = new Account();
		//create an object with parameter
		Account account1 = new Account(1122,20000);
		//set interest rate
		account1.setAnnualInterestRate(4.5);
		//withdaw
		account1.withdraw(2500);
		//deposit
		account1.deposit(3000);
		account1.getMonthlyInterestRate();
		//print out
		System.out.print(account1.toString() + "\n");
		
		//the savings account
		System.out.println("Savings Account-------------------------");
		//create a default object
		SavingsAccount defaultAccount2 = new SavingsAccount();
		/*force user to input id 
		 *balance
		 *annualInterestRate
		 */
		System.out.print("input savings account id : ");
		testId = input.nextInt();
		System.out.print("input savings account balance : ");
		testBalance = input.nextDouble();
		System.out.print("input savings account annualInterestRate : ");
		testAnnualInterestRate = input.nextDouble();
		//create an object with parameter that user input
		SavingsAccount account2 = new SavingsAccount(testId,testBalance,testAnnualInterestRate);
		System.out.print("withdraw (cannot be overdrawn) : ");//withdaw, savings account cant be overdrawn
		testWithdraw = input.nextInt();
		account2.savingsWithdraw(testWithdraw);
		//deposit
		System.out.print("deposit : ");
		testDeposit = input.nextInt();
		account2.savingsDeposit(testDeposit);
		account2.getSavingsMonthlyInterest();
		//print out
		System.out.print(account2.toString() + "\n");
		
		//the checking account
		System.out.println("Checking Account------------------------");
		//create a default object
		CheckingAccount defaultAccount3 = new CheckingAccount();
		/*force user to input id 
		 *balance
		 *annualInterestRate
		 */
		System.out.print("input checking account id : ");
		testId = input.nextInt();
		System.out.print("input checking account balance : ");
		testBalance = input.nextDouble();
		System.out.print("input checking account annualInterestRate : ");
		testAnnualInterestRate = input.nextDouble();
		//create an object with parameter that user input
		CheckingAccount account3 = new CheckingAccount(testId,testBalance,testAnnualInterestRate);
		System.out.print("withdraw (has an overdraft limit of -5000) : ");//withdaw, checking account can be overdraft with limit
		testWithdraw = input.nextInt();
		account3.checkingWithdraw(testWithdraw);
		//deposit
		System.out.print("deposit : ");
		testDeposit = input.nextInt();
		account3.checkingDeposit(testDeposit);
		account3.getCheckingMonthlyInterest();
		//print out
		System.out.print(account3.toString());
		
	}
}
