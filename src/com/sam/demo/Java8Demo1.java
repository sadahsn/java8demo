package com.sam.demo;

public class Java8Demo1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass class1 = new MyClass();
		class1.show();
		Java8Demo1 demo1 = new Java8Demo1();
		System.out.println(demo1.myMethod().getName());
		
	}
	
	public Person myMethod(){
		Person p = new Person();
		p.setName("sada");
        try {
          p.setName("Shiva");
            return p; // control will not be passed to main() method here
        } catch (final Exception e) {
        	 p.setName("Murthi");
            return p; // Control will not be passed to main() method here
        } finally {
        	 p.setName("SS");           
            System.out.println("finally block is always executed");   
// Control will be passed to main() method after executing this block
        }
	}

}	

class Person{
	String name;
	void setName(String name){
		this.name=name;
	}
	String getName(){
		return name;
	}
}
	class MyClass implements A,B{

		/*public void show(){
			System.out.println("inside class");
		}*/
		
		@Override
		public void add() {
			
		}

		@Override
		public void show() {
			// TODO Auto-generated method stub
			B.super.show();
		}

		
		
	}

	interface A{
		void add();
		default void show() {
			System.out.println("A");
		}
	}
	interface B{
		void add();
		default void show(){
			System.out.println("B");
		}
	}


