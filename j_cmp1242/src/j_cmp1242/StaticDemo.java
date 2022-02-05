package j_cmp1242;
//https://stackoverflow.com/questions/4343760/when-is-static-variable-loaded-in-java-runtime-or-compile-time
public class StaticDemo {
	// a static initialization block, executed once when the class is loaded
	 static {
		 
	  System.out.println("Class StaticDemo loading...");//1
	 }

	 // a constant
	 static final long ONE_DAY_IN_MILLIS = 24 * 60 * 60 * 1000;

	 // a static field
	 static int instanceCounter;

	 // a second static initialization block
	 // static members are processed in the order they appear in the class
	 static {
		 
	  // we can now access the static fields initialized above
	  System.out.println("ONE_DAY_IN_MILLIS=" + ONE_DAY_IN_MILLIS
	    + " instanceCounter=" + instanceCounter);
	 }//2

	 // an instance initialization block
	 // instance blocks are executed each time a class instance is created,
	 // after the parent constructor, but before any own constructors (as remarked by Ahmed Hegazy)
	 {
	  StaticDemo.instanceCounter++;
	  System.out.println("instanceCounter=" + instanceCounter);//5//6
	 }	 
	 public StaticDemo () {
		 instanceCounter++;		 
	 }
	 public static void main(String[] args) {		
	  System.out.println("Starting StaticDemo");//4
	  new StaticDemo();//called instance initialization block
	  new StaticDemo();
//	  new StaticDemo();
	 }

	 static {
	  System.out.println("Class StaticDemo loaded");
	 }//3
}
