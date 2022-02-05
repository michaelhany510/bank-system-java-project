package oop_1242;

import java.util.Scanner;

//https://www.javatpoint.com/this-keyword
public class Student {
	int rollno;  
	String name,course;  
	float fee;
	
	Student() {//default constructor//modifier?
		System.out.println("hello!!");
	}

	Student(int x) {//parameterized constructor 
		this(); //constructor chaining
		System.out.println(x);
	}
		  
	Student(int rollno,String name,String course){  
		this.rollno=rollno;  
		this.name=name;  
		this.course=course;  
	}  
	Student(int rollno,String name,String course,float fee){  
		//Student(rollno,name,course);??ERROR
		//this.fee=fee;  //this constructor must be the first line in a constructor 
		this(rollno,name,course);//reusing constructor//this constructor first  
		this.fee=fee;  //this instance variable next
	}  
	void display(){System.out.println(rollno+" "+name+" "+course+" "+fee);}

	public static void main(String[] args) {
		// TODO Auto-generated method stub				
		Scanner input = new Scanner(System.in);  
			 
		double ipDeposit=0;
		boolean test = true;
		while (test) {
			System.out.println("\nPlease enter the deposit amount: ");
			try {
				ipDeposit=input.nextDouble();//exception..1) try and catch
				test = false;
			}
		catch(Exception e){
		input.next();
		
		System.out.println("Please Enter a valid value");
		     
		       
		}
		     
		System.out.printf(" the deposit is %f", ipDeposit);
		}
//		Student s0=new Student();
//		Student s1=new Student(111,"Ahmad","java");  
//		Student s2=new Student(112,"Ali","java",6000f);  
//		s0.display();
//		s1.display();  
//		s2.display();
//		
//		Student a = new Student(10);
//		Student b = new Student(10);
//		a and b are equal in value, but they differ in reference
//		(arrows: Lec 1_2 slide 11)
//		Student c=a;//have the same reference
//		System.out.println(a);
//		System.out.println(b);		
//		System.out.println(c);
		//		if (a.equals(c))
		//			System.out.print("equals");

	}//end main

}//end class
