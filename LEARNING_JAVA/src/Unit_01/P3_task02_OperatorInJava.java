package Unit_01;
/*
 * operators in java is a symbol that is used to perform operations 
 * sum=a+b;
 * 	for example: +,-,*,/
 * 	#types of operators in java
 * 		-Unary operators : {prefix and postfix}[a++,a--,++a,etc]
 * 		-Arithmatic operators: {*,-,/,+,%}
 * 		-Shift operators: {<< , >>}
 * 		-relational operators: {> < <= >= !=
 * 		-Bitwise operators : {& ^ |}
 * 		-Logical operators : {&& ||}
 * 		-ternary operators: {? : }
 * 		-Assignment operators: {=,+=,-=,/=,%=,&/,>>=,>>=}
 */

public class P3_Task02_OperatorInJava {

	public static void main(String[] args) {
		 OperatorsInJava obj = new OperatorsInJava() ; 
		 obj.UniaryOperator() ; 
		 obj.ArithmeticOperator() ; 
		 obj.ShiftOperator() ; 
		 obj.RelationalOperator() ; 
		 obj.BitwiseOperator() ; 
		 obj.AssignmentOperator() ; 

	}

}
class OperatorsInJava
{
	void UniaryOperator(){
		int a=10;
		System.out.println(a++);
		System.out.println(++a);
		System.out.println(a--);
		System.out.println(--a);
		
		
	}
	void ArithmeticOperator()
	{
		int a=10,b=5;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
	}
	void ShiftOperator()
	{
		System.out.println(10<<2);
		System.out.println(10>>2);
	}
	void RelationalOperator() {
		int a=10,b=5;
		System.out.println(a==b);
		System.out.println(a!=b);
		System.out.println(a>=b);
		System.out.println(a<=b);
	}
	void BitwiseOperator()
	{
		int a=10,b=5,c=20;
		// Logical && and Bitwise &
		System.out.println(a<b && a++<c);
		System.out.println(a);
		
		// Logical || and Bitwise |
		System.out.println(a>b || a<c); // true || true = true 
		System.out.println(a>b || a++<c); // true || true = true 
		System.out.println(a);
		
		System.out.println("Bitwiswe incluse OR: "+ (12|12)); // 1100|1100 = 1100
		System.out.println("Bitwiswe exclusive OR: "+ (12^12)); // 1100|1100 = 0000
		
	}
	void AssignmentOperator() 
	{
		System.out.println("Inside the Assignment Operator");
		int a =10, b=20 ; 
		a += 4 ; 
		b += 4 ; 
		System.out.println(a);
		System.out.println(b);
		
		b>>>=2  ; 
		System.out.println(b);
		a = 10 ; 
		a += 3 ; 
		System.out.println(a);
		a -= 4 ; 
		System.out.println(a);
		a *= 2 ; 
		System.out.println(a);
		a /= 2 ; 
		System.out.println(a);
	}
	
}