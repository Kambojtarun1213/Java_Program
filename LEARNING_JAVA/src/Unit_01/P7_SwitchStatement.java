package Unit_01;
import java.util.Scanner ; 
import java.util.Calendar;
/* Problem Statement: P7_SwitchStatements: 
   Create a switch statement [Manual], In Which:
	 a. When you pass 1 your program would print current year
	 b. When you pass 2 your progss1ram would print current month
	 c. When you pass 3 your program would print current day
	 d. When you pass 4 your program would print Not applicable 
 * */

public class P7_SwitchStatement {

	public static void main(String[] args) {
		
		SwitchStatements obj = new SwitchStatements();
		obj.switchStatements();

	}

}


class SwitchStatements {
	void switchStatements() {
		
		Scanner sc = new Scanner(System.in) ; 
		System.out.println("Enter the number from 1 t0 4");
		int a = sc.nextInt() ; 
		 Calendar now = Calendar.getInstance();
		switch(a)
		{
		case 1:
			System.out.println("Current Year is : " + now.get(Calendar.YEAR));
			break ; 
		case 2:
			System.out.println("Current Month is : " + (now.get(Calendar.MONTH) + 1));
			break ; 
		case 3:
			System.out.println("Current Date is : " + now.get(Calendar.DATE));
			break ; 
		case 4:
			System.out.println("Not applicable");
			break ; 
		default:
			System.out.println("You have enter wrong choice");
		}
	}
}