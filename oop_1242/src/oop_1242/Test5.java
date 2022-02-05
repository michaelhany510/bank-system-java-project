package oop_1242;

interface myInterface{
void a();//all are abstract methods...VS. concrete
void b();
void c();
void d();
}

abstract class ClassImplementsInterface implements myInterface{
public void c(){System.out.println("I am C_parent");}
public void b(){System.out.println("I am b");}
}

class ChildClass extends ClassImplementsInterface{
public void a(){System.out.println("I am a");}
public void d(){System.out.println("I am d");}
public void c(){System.out.println("I am C_child");
super.c();
}
}

class Test5{
public static void main(String args[]){
myInterface a=new ChildClass();
a.a();
a.b();
a.c();
a.d();
}}

