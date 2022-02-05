package oop_1242;

import java.util.Scanner;

//driver class
public class AccountTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);//warning??
		Account1 myAccount = new Account1();//instance of class/object
		// display initial value of name (null)
		//System.out.printf("Initial name is: %s%n%n", myAccount.getName());
		//System.out.printf("Initial name is: %s%n%n", myAccount.name);
		// create an Account object and assign it to myAccount
		// prompt for and read name
		System.out.println("Please enter the name:");
		String theName = input.nextLine();//usr input 
		//myAccount.name=theName;
		myAccount.setName(theName);
		Student st=new Student();
//		System.out.println(); // outputs a blank line
		// display the name stored in object myAccount
		System.out.printf("Name in object myAccount is:%n%s%n", myAccount.getName());		
				
		input.close();
	}

}
