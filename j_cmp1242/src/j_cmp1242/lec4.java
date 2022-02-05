package j_cmp1242;



public class lec4 {
	// Scoping //continue //break //methods //recursion
	static int i=0;
//	A single copy of a static variable is maintained
//	for all the ObjectS of the class.
	public void myMethod2() {//non static
		//System.out.print("hello");
		i++;
	}
	public static void myMethod() {//static
//		System.out.print(i++); 
		//j++;			// out of scope, unidentified var
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{ //Block scope
		int k=10;
		k++;
		}
		
		
		//System.out.print(k); // out of scope, unidentified var 
		
		
		int j=1; //public is an illegal modifier within a method
		//scoping
		//varMethod++; //unresolved var
		for (j=0;j<5;j++) 			
			System.out.print("hello"+j);
		
//		System.out.print("\n"+j);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				
		
		boolean flag=false; //nested
//		for (int j1=0;j1<5;j1++) {
//			for (int j2=0;j2<5;j2++) {
//				if (j2==1) continue;//after continue stat., go to line 54 and increment the counter, 
//				if (j2==4) {
//					flag=true;	
//					break;
//				}			
//				System.out.print("\n" +j2);//str1 appended to var
//			}
//			//compiler next line after "BREAK"
//			System.out.print(j1);
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		flag=false;
		//for,/.,/,{
		nameBlock: ///annotates the next block starting at the next curly brace and its matching brace
		for (int j1=0;j1<5;j1++) {
			for (int j2=0;j2<5;j2++) {
				if (j2==1) continue;
				if (j2==4) {
					flag=true;	
					break nameBlock;
				}			
				System.out.print("\n" +j2);
			}
			System.out.print(j1);
		}//end nameBlock
		//System.out.print(j2);//variable cannot be resolved == unidentified var
		//}
		
		//System.out.print(s);

	}//end main
		
}//end class
