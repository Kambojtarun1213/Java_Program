package Unit_01;
/*
 * #  Control Statement and Conditional Statement 
 * java provide three type of control flow statements.
 * - Decision making statement 
 *   - if statement 
 *   - switch statement 
 * 
 * - Loop Statement 
 *   - do while loop 
 *   - while loop 
 *   - for loop 
 *   - for-each loop
 * - Jump Statement 
 *   - break statement 
 *   - continue statement 
 */
public class P4_Task01_ControlAndConditionalStatementInJava {

	public static void main(String[] args) {
		Statement obj = new Statement() ; 
		obj.DecisionMakingStatement() ; 
		obj.LoopStatement() ; 
		obj.JumpStatement() ;
	}

}
class Statement
{
	void DecisionMakingStatement()
	{
		int x = 10, y =12 ; 
		if(x+y<10)
			System.out.println("x + y is less than to 10");
		else
			System.out.println("x+y is greater than to 20");
		
		int num =2 ; 
		switch(num) { // switch expression
		case 0 :
			 System.out.println("Number is 0");
			 break  ; 
		case 1:
			System.out.println("Number is 1");
			break ; 
		case 2 :
			System.out.println("Number is 2");
			break ; 
		default:
			System.out.println("Enter the correct number");
				
		}
	}
	void LoopStatement()
	{
		// for(initialization; condition; increment/decrement) {// block of statement }
		// for(data_type var : array_name/collection_name){//statement} 
		int sum = 0 ; 
		for(int j=0; j<=10; j++)
			sum += j ; 
		System.out.println("The sum of the first 10 natural number "+sum);
		
		/// for-each loop
		String[] name = {"C", "Java", "Python", "CSS"} ; 
		for(String n : name)
			System.out.println(n);
		
		// while(condition){statement} 
		int i=0  ;
		System.out.println("First ten natural number is ");
		while(i<=10) {
			System.out.println(i);
			i++ ; 
		}
		
		// do-while loop
		/*
		 * do{
		 *    statement }while(condition) 
		 */
		
		i=0 ; 
		System.out.println("Printing the even number ");
		do {
			System.out.println(i);
			i = i+2 ;
		}while(i<=10) ; 
	}
	void JumpStatement()
	{
		// Break 
		for(int i=0; i<=10; i++) {
			System.out.println(i);
			if(i==6)
				break ; 
		}
		
		// Continue 
		for(int i=0; i<=10; i++) {
			if(i==6)
				continue ; 
			System.out.println(i);
		}
	}
	
}