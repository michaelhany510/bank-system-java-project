package oop_1242;

import java.util.InputMismatchException;

//lec7 oop: printf, invalid input?, .nextDouble, arr of objects,
//https://www.javatpoint.com/this-keyword
	
//try, catch, finally, exception, 
//important topics: inheritance, polymorphism 
import java.util.Scanner;

//Chapter 3 Deitel and Deitel
//driverclass
public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);//warning??
//		Account myAccount = new Account();//instance of class/object
//		// display initial value of name (null)
//		System.out.printf("Initial name is: %s%n%n", myAccount.getName());
//		//System.out.printf("Initial name is: %s%n%n", myAccount.name);
//		// create an Account object and assign it to myAccount
//		// prompt for and read name
//		System.out.println("Please enter the name:");
//		String theName = input.nextLine();//usr input 
//		//myAccount.name=theName;
//		myAccount.setName(theName);
//		System.out.println(); // outputs a blank line
//		// display the name stored in object myAccount
//		//System.out.printf("Name in object myAccount is:%n%s%n", myAccount.getName());		

		
		/////2nd Lec OOP//// 
//		Account acc0=new Account();??
		Account acc1=new Account("John", 32);
		Account acc2=new Account("Mariam", -15);
		System.out.println(acc1.getBalance());
		System.out.println(acc2.getBalance());
//		for(int i=0;i<2;i++)?? target??
//			System.out.println(acc1.getBalance());???		
		System.out.println("Please enter the deposit amount for acc1: ");
		double ipDeposit=input.nextDouble();//exception?? how to resolve
		acc1.deposit(ipDeposit);		
		System.out.printf("\n\n %s owns %.2f \n\n", acc1.getName(),acc1.getBalance());
		//s123
		//exception VS. error message
		Account[] accAll=new Account[2];//array of objects
		accAll[0]=new Account("Zero", 3.5);
		accAll[1]=new Account("One", 32);
		for(int i=0;i<2;i++)
			System.out.printf("\n\n %s owns %f \n", accAll[i].getName(),accAll[i].getBalance());
		
//		System.out.println("Please enter the deposit amount: ");
//
//		try {
//			ipDeposit=input.nextDouble();//exception..1) try and catch
//		}
//		catch(Exception e){
//			ipDeposit=0;
//		}
//		finally {//finally block will be ALWAYS executed anyways 
//			System.out.printf("Anyways, a deposit amount of %f was made \n", ipDeposit);
//		}
		System.out.println("");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		boolean err=true;		
		while (err) {//Always receive user input			 
			System.out.println("Please enter deposit");
			try {
				ipDeposit = input.nextDouble();//if there is an exception
				//, jump to the line right after the "catch"
				err=false;
			} catch (InputMismatchException e) {
				System.out.println("Invalid Input");
				input.next();					
			}						
		}		
		input.close();
		System.out.print("The End");
		}//end main
	}//end class
