
   
package Unit_01;
/*
 *  It is called when an instance of a class is created 
 *  At the time of calling the constructor, memory for the object is allocated in the memory 
 *  It is a special type of method which is used to initialize the object 
 *  Every time an object is created using the new() keyword at least one constructor is called 
 *  Two types of constructor in java
 *    - Parameterized Constructor 
 *    - Default Constructor 
 */
public class P5_Task05_ConstructorInJava {

	public static void main(String[] args) {
		ABC4 obj = new ABC4()  ; 
		ABC4 obj1 = new ABC4(4)  ; 
		
		System.out.println(obj.a);
		System.out.println(obj1.a);
	}

}
class ABC4
{
	int a ; 
	/*
	 * Classname (Constructor Parameter ){
	 *   All the class and Instance variable can be intialized  here }
	 */
	ABC4()
	{
		a = 10 ; 
	}
	ABC4(int a )
	{
		this.a = a ; 
	}
	
	static void display()
	{
		int b = 10 ;  
		System.out.println(b); 
		System.out.println(a);
	}
	
	int display2()
	{
		System.out.println(a);
		
		// As a was a local variable so we cannot access it outside the method 
		return a ; 
	}
}