package j_cmp1242;//package

public class lec5 { //recursion and debugging
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Student st=new Student();??
//		System.out.print(1);
	    int a = 3;
        fun(a);
        
//		int k=fact(5);
		//int k =0;
//		printFun(5);
//		System.out.print(k);
//		p2();
	}
	static void fun(int x)
    {
        if(x > 0)//1//3//5//7
        {
            fun(--x);//2//4//6
            System.out.print(x + " ");//8//9//10-->0           
        }
    }
     
    
    
    static void p(){
		System.out.println("hello"); 
		p();
		}
	
//	static {
//		
//	}//static block
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	static int count=0; 	
	static void p2(){  
	count++;  
	if(count<=5){  
	System.out.println("hello "+count);  
	p2();  
	}  
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	static void printFun(int test)
    {
        if (test < 1)
            return;
  
        else {
            System.out.printf("%d ", test);
  
            // Statement 2
            printFun(test - 1);
  
            System.out.printf("%d ", test);
            return;
        }
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static int sum(int k) { //recursion//cumulative sum
		int tmp;
	    if (k > 0) {
	    	tmp=k +sum(k - 1);         //.   //ERR...
	    	System.out.print("\n"+tmp);// ...//ERR: k+sum(k);
	    	return tmp;               //k+sum(k-1) //ERR: k+sum(k-1)
	    } else {
	      return 0;
	    }
	  }//end method Sum

	
	public static int fact(int k) { //recursion
		int tmp=1;
	    if (k > 0) {
	    	tmp=k *fact(k - 1);
	    	System.out.print("\n"+tmp);// 1	2 6 24 120 CORRECT OR 20 60 120 120 120 WRONG
	    	return tmp;
	    } else {
	      return 1;
	    }
	  }//end method Sum
}
