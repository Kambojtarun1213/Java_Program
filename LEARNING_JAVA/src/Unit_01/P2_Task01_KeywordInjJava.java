package Unit_01;
/*  50 word reserved in java for the keyword 
 *  48 + 2 
 *  48 are in the use 
 *  2 for the future use(goto, const)
 *  
 *  future use goto const 
 *  1.2v : assert**
 *  1.4v : strictfp***
 *  5.0v : enum****
 *  Keyword cannot be use as identifier in java 
 *  - object 
 *  - variable name 
 *  - class 
 *  - function 
 *  - etc
 * */
public class P2_Task01_KeywordInjJava {

	public static void main(String[] args) {
		// Variable name 
		// Syntax error on token "double" invalid variable declaration 
		int double = 12 ; 
		
		// function name 
		int float ()
		{
			System.out.println("Error in the function");
		}
		// Class define given below 
		// Object name cannot be a keyword 
		Abs int = new Abs() ; 

	}

}
// Class name cannot be a keyword 
class double
{
	void display()
	{
		System.out.println("In the double class");
	}
}
class Abs
{
	void display()
	{
		System.out.println("In the Abs class");
	}
}