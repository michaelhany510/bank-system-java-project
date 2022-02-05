package oop_1242;
//lec 6 (1 oop): driver class, setter and getter, private and public, 
//scanner //constructor (No Return) //uml //imported java.lang already
//this 
//lowercase, uppercase, CamelCase1, camelCase2
//user,      AVG,       BankAccount (class names), 
//usrName variable names and methods
public class Account {//access modifier
	private String name; // instance var vs. local var?
	private double balance;
	// method to set the name in the object      
//	public Account(arg) { //no return
//		
//	}
	public void setName(String usrName)              
	{ 
		//if usrname contains--> decline setName, return with error ask for new input
	   name = usrName; // store the name
	   //this.name = name; // if the arg list had "name"
	}                                             
//	// method to retrieve the name from the object   
	public String getName()                          
	{                                                
	   return name; // return value of name to caller
	}                                                
//	public Account(String usrName) {//compiler won't build the default cons
//		name=usrName;
//	}
	public Account(String usrName, double balance) {//balance is local var
		name=usrName;
		if (balance>=0)
				this.balance=balance; //this.balance refers to the instance var;
		//rhs refers to local var in the method
	}
	public void deposit(double amount) {
		if (amount>0)
			balance=balance+amount;
	}
	public double getBalance() {
		return balance;
	}

}
