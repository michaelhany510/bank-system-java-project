package j_cmp1242;



import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;



public class try2 {

	public static void main(String[] args) {
		lec4.myMethod();//how to access STATIC methods in another class
		
		lec4 accessTry=new lec4();//class objectname=new class();
		//accessTry.myMethod2();//how to access NON STATIC methods in another class
		//lec4.myMethod();//class.static method/variable	//lec4
		//lec4.myMethod2();//ERROR: access nonstatic method by class itself
		//accessTry.myMethod();//WARNING: access static method by object
		//object.nonstatic method/variable	//accessTry
		System.out.print(accessTry.i);
		System.out.println(lec4.i);
		
		lec4.i++;
		System.out.print(accessTry.i);//poor writing ///warning
		System.out.println(lec4.i);
		
		accessTry.i++;//poor writing ///warning
		System.out.print(accessTry.i);
		System.out.print(lec4.i);

		// TODO Auto-generated method stub
//		int x=3;
//		int y=x;		
//		System.out.printf("x is %d and y is %d",x,y);
//		x=4;
//		System.out.printf("\nx is %d and y is %d\n\n",x,y);
////		
//		int []x_arr= {3,5};
//		int []y_arr=x_arr;		
//		System.out.print(Arrays.toString(x_arr));
//		System.out.println(Arrays.toString(y_arr));
//		y_arr[0]= 4;
//		System.out.print(Arrays.toString(x_arr));
//		System.out.println(Arrays.toString(y_arr));
//		
		
		//LOOPS Conditions
		//For, While, Do-while
//		System.out.print(0);	System.out.print(2);
//		System.out.println(4);
//		
//		System.out.print(0);
//		System.out.print(0);
//		System.out.println(0);
		
//		for (int i=0; i<5;i++) {
//			System.out.print(i);
//			System.out.print(0);
//			
//		}
				
//		int [] rand= {-10, 20, -30, 50};
//		
//		for (int i=0; i<rand.length; i++) {//curly braces
//			if (rand[i]<0) break; //brackets, square brackets
//			else System.out.print(rand[i]);//() parentheses, round brackets
//		}
//		System.out.println("");
//		int i=0;
//		while (rand[i]>=0){
//			System.out.print(rand[i]);//prints the NEXT "print/ln" op in a new line
//			i++;			}
//		System.out.println("");
//
//		i=0;
//		do {
//			System.out.print(rand[i]);
//			i++;			
//		}while(rand[i]>=0);
////	
		
        //char='s'., '\
//		char a = 65, b = 66, c = 67, d=130;//char a='A' eqv char a=65;//ascii 0=127//?=63
		//https://en.wikipedia.org/wiki/ASCII
//		System.out.println(2/3);//int//(datatype)value or variable
//		System.out.println((float)2/3); //max 7 decimal places//4 bytes
//		System.out.println((double)2/3); //max 16 decimal places//8 bytes
//		
//		System.out.println((int)2/3); //max 7 decimal places
//		System.out.println((float)2); //max 16 decimal places
		
//		System.out.println(a);//http://www.asciitable.com/
//		System.out.println(b);//http://www.asciitable.com/
//		System.out.println(c);//http://www.asciitable.com/
//		System.out.printf("%c %c %c",a, b,c);
//		char [] ch_arr= {a,b,c};
//		System.out.println("");
//		System.out.print(ch_arr);
//		System.out.println(d);//
//		System.out.println((char)159);//
//		System.out.println((char)255);//
//		System.out.println((char)130);//https://en.wikipedia.org/wiki/Windows-1252
//		System.out.println("Default: " + new InputStreamReader(System.in).getEncoding());//Cp1252

		
//		System.out.println((int)a);//casting
//		System.out.println(Character.toString(c));
//		char [] ch_arr= {a,b,c};
//		System.out.print(ch_arr);
//		//System.out.print(a,b,c);
//		System.out.println(a+""+b+c);//+++ --> concatenation, 
//		System.out.println(a+b+c);//+++ --> casting to int and addition,
//		//+"" --> string/character concatenation
//		String str=a+""+b+c;
////		x1+x2+x3---> numerical addition
////		x1+x2+""+x3 ---> concatenation
//		System.out.print(str);//+++ --> casting and addition,
//		//System.out.print((char)a+b+c) eqv System.out.print(a+b+c);
//		System.out.print((char)(a+b+c));//198
//		String x=a+""+b+c;
//		char y=a+''+b+c;//Even abc ~ char max ONE character
//		System.out.println("");
//		//System.out.printf("First Name: %s\nLast Name: %s",a, c);
//		System.out.printf("First Name: %2s%2s%2s \n",a, b,c);
//		System.out.printf("First Name: %c%c%c \n",a, b,c);
//		System.out.printf("First Name: %d %d %d",(int)a, (int)b,(int)c);
		
		
////		//Syntax ERRORS
//		int avg=3;
//		int AVG=5; //Syntax error, //Java is case-sensitive // detected by the compiler
		
//		System.out.print("str str str ..........................................
//				str str str ");  //Syntax error,  // detected by the compiler
//		System.out.print("str str str " +
//		            "str str str");
//		System.out.print("jfsklfjsfjsfsjfljflksfjs"
//				+ "");
//		Scanner GetChoice = new Scanner(System.in);//missing a class that MUST be imported, detected by compiler

//		// Semi-colon, curly braces{}, , parentheses (), missing import certain class(es)
//		
//		//Semantic ERRORS
//		boolean flag=true;
//		x=(int)flag;//semantic error//detected by compiler
//		int value=3/2; //1//semantic error//NOT detected by compiler
//		float val_float=value;		
//		float val_float2=3/(float)2;
//		System.out.println(value);
//		System.out.println(val_float);
//		System.out.println(val_float2);
		
	
	}

}
