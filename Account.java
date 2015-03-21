/*U10316035
 *Lin Tz Hau
 */
 
 //The Account class
 
 import java.util.Date;
 import java.text.DateFormat;
 import java.text.SimpleDateFormat;
 
 public class Account{
	//private int data field named id
	private int id;
	//private double data field named balance
	private double balance;
	//private double data field named annualInterestRate
	private double annualInterestRate;
	//private double data field named dateCreated that stores date
	private Date dateCreated = new Date();
	double monthlyInterestRate;
	double monthlyInterest;
	/*no-arg constructor that creates a default account
	 *id,balance,annualInterestRate that defaulted 0
	 */
	Account(){
		id = 0;
		balance = 0;
		annualInterestRate = 0;
	}
	//constructor that creates an account with specified id and initial balance
	Account(int newId, double newBalance){
		id = newId;
		balance = newBalance;
	}
	//the accessor method for id
	public int getId(){
		return id;
	}
	//the accessor method for balance
	public double getBalance(){
		return balance;
	}
	//the accessor method for annualInterestRate
	public double getAnnualInterestRate(){
		return annualInterestRate;
	}
	//the accessor method for dateCreated
	public String dateCreated(){
		dateCreated.getTime();
		DateFormat date = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss:SS");
		return date.format(dateCreated);
	}
	//the mutator method for id
	public void setId(int newId){
		this.id = newId;
	}
	//the mutator method for balance
	public void setBalance(double newBalance){
		this.balance = newBalance;
	}
	//the mutator method for annualInterestRate
	public void setAnnualInterestRate(double newAnnualInterestRate){
		this.annualInterestRate = newAnnualInterestRate;
	}
	//method named getMonthlyInterestRate() that returns monthly interest rate
	public double getMonthlyInterestRate(){
		monthlyInterestRate = (annualInterestRate / 100) / 12;
		return monthlyInterestRate;
	}
	//method named getMonthlyInterest() that returns monthly interest
	public double getMonthlyInterest(){
		monthlyInterest = monthlyInterestRate * balance;
		return monthlyInterest;
	}
	//method named with draw that withdraw a specified amount from account
	public void withdraw(int withdraw){
		balance = balance - withdraw;
	}
	//method named with draw that deposit a specified amount to account
	public void deposit(int deposit){
		balance = balance + deposit;
	}
	// toString() method with balance , monthly interest , date that 8.6 asked for
	public String toString(){
		return "balance : $ " + getBalance() + "\n"
							+"monthly interest : $ " + getMonthlyInterest() + "\n"
								+"date : " + dateCreated() + "\n";
	}
	
 }
