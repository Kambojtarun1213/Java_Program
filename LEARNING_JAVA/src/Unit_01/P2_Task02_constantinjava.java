package Unit_01;
/* constant never change once a value is assigned 
 * private : Inside the class only 
 * protected : class + package 
 * public : class + within package + outside the package 
 * Default : No keyword, private-private{Not outside the package}
 */

public class P2_Task02_constantinjava {
    public static final double pi = 3.14 ; 
	public static void main(String[] args) {
		
         System.out.println("The value of Pi is "+pi);
         main("I am learnig java") ; 
         P2_Task02_constantinjava obj = new P2_Task02_constantinjava() ; 
         obj.add(10, 20);
         Newclass obj2 = new Newclass() ; 
         obj2.add(25, 65);
	}
	public static void main(String s) {
		System.out.println(s);
		System.out.println("The value of the pi "+ pi);
	}
	public void add(int a, int b)
	{
		System.out.println("The sum of two number is "+ (a+b));
	}

}
class Newclass
{
	public void add(int a, int b)
	{
		System.out.println("The sum of two number is " + (a+b));
	}
}