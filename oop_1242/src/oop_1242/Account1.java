package oop_1242;
//lec 6 (1 oop): driver class, setter and getter, private and public, 
//scanner //constructor (No Return) //uml //imported java.lang already
//this 
public class Account1 {
		private String name; // instance var vs. local var?
//		public Account1(argumentlist) { //no return
//			
//		}
		public void setName(String name)              
		{ 			
			//if usrname contains--> decline setName, return with error ask for new input
		   this.name = name; // store the name..x=x?? x=y
		   //this.name = name; // if the arg list had "name"
		}                                             
//		// method to retrieve the name from the object   
		public String getName()                          
		{                                                
		   return name; // return value of name to caller
		}                                                
//		public Account1(String usrName) {//compiler won't build the default cons
//			name=usrName;
//		}
}
