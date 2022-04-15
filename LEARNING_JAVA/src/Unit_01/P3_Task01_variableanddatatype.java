package Unit_01;
/*
 *  Variable in java is a data container that save the data values during the java program execution 
 *  
 *  Types of Variables 
 *  In java there are  three types of variables 
 *  
 *  1.  Local variable :- Declare inside the body of method 
 *  
 *  2.  Instance Variable :- Instance Variable are declare without any static keyword.
 *      - They are declare outside a method declaration.
 *      - They are the object specific and are known as instance variable 
 *  
 *  3.  Static Variable 
 *      - static variable are define with the STATIC keyword. 
 *      - Static variable are intialized only once. at the start of the program execution.
 *      - These Static Variable should be intialized first, before the intialization.
 *      
 */
public class P3_Task01_variableanddatatype {
    static int q = 11 ; 
    int p =10 ; 
	public static void main(String[] args) {
		// Valid declaration 
		int a,b,c ; 
		float pi ; 
		double d ; 
		char e  ; 
		
		// Valid intialization 
		pi = 3.14f  ; 
		d = 20.22 ; 
		e = 'v' ; 
		
		a = 10 ; 
		b= 20 ; 
		c = 30 ; 
		
		System.out.println(a);
		System.out.println(b) ; 
		System.out.println(c);
		
		System.out.println(pi);
		System.out.println(d);
		System.out.println(e);
		
		int myNum = 5 ; /// Integer (whole number) 
		float myFloat = 5.99f ;  // Floating point number 
	    char myLetter = 'D' ;  // Character 
	    boolean myBool = false ; // Boolean 
	    String mytext = "I am learning the java" ; // String 
	    
	    System.out.println(myNum);
		System.out.println(myFloat) ; 
		System.out.println(myLetter);
		System.out.println(myBool);
		System.out.println(mytext);
		
		
		// Java Variable Type Conversions & Typecasting
		
		double f ; 
		int i = 11 ; 
		f = i ; // Type conversion 
		
		double g = 20 ; 
		int j ; 
		j = (int)g ; // Type Casting
		
		System.out.println(i);
		System.out.println(f) ; 
		System.out.println(g);
		System.out.println(j);
		
		byte k = 10 ;  // 1 byte 
		boolean l = true ;  // 1 bit 
		long m = 20L ; 
		float n = 1.2f ;  
		double o = 1.23 ; 
		
		System.out.println(k);
		System.out.println(l) ; 
		System.out.println(m);
		System.out.println(n);
		System.out.println(o);
		
		System.out.println(ABC.j);  // data + function/method 
		ABC obj1 = new ABC() ; 
		System.out.println(obj1.i++);
		System.out.println(obj1.i);
		
		ABC obj2 = new ABC() ; 
		System.out.println(obj2.i);
		
		System.out.println(ABC.j++);
		System.out.println(ABC.j);
		
	}	
	int r = 20 ; 
	void display()
	{
		int a = 10 ; // local variable 
		System.out.println("This is Display Method");
		System.out.println(a);
	}
}

class ABC 
{
	static int j = 10 ; // class variable/ static variable 
	int i = 10 ; // Instance variable 
	
	static void display() {
		int a = 10 ; // local variable 
		System.out.println("This is Display Method");
		System.out.println(a);
		
	}
	static void typeConversionAndTypeCasting() {
		/*
		 *  double f ; // 8 byte = 64 bits/slots int i = 10 ; // 4 bytes = 32 bits/slots 
		 *  
		 *  double g = 10 ; // 64 int j ; // 32 j = (int) g ; 
		 */
		
		double f ; // 64 bits 
		int i = 10 ; // 32 slots 
		f = i ; // Type conversion
		System.out.println(f);
		
		double g = 10 ; 
		int j ; // 32 
		j = (int )g ; // Type casting
		// 32 bits = 64 bits 
		
		System.out.println(i);
		System.out.println(j);
	}
}