package Unit_01;
import java.util.Scanner ; 

/*
 * When user take input from the console 
 * nextLine()    :-  Read user input [to read String]
 * nextBoolean() :-  Read a boolean value from the user 
 * nextByte()    :-  Read a byte value from the user 
 * nextDouble()  :-  Read a double value from the user
 * nextFloat()   :-  Read a float value from the user 
 * nextInt()     :-  Read a integer value from the user
 * nextLong()    :-  Read a long value from the user 
 * nextShort()   :-  Read a short value from the user 
 */
public class P4_Task03ScannerClassInJava {

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in) ; // Create a Scanner object 
		Scanner sc2 = new Scanner(System.in) ; 
		
		// Reading the first name by using next() it will read till space only
		String first = sc1.next() ; 
		System.out.println("Name is "+first);
		
		String name = sc2.nextLine() ; 
		System.out.println("Name is "+name);
		
		boolean b = sc2.nextBoolean() ; 
		System.out.println(b);
		
		sc1.close(); 
		sc2.close();

	}

}