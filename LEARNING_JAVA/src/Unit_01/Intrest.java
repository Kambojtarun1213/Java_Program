package Unit_01;
import java.util.Scanner ;
import java.lang.Math;
//import java.util*;
public class Intrest {
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in) ;
			System.out.println("enter the nember 1.for term deposit 2.for reccuring deposit");
	int option= sc.nextInt();
	double p=0.0,r=0.0,a=0.0,b=0.0;
	int n;
	switch(option)
	{
	case 1:
		System.out.println("enter the principle amount");
		p=sc.nextDouble();
		System.out.println("enter the intrest rate");
		r=sc.nextDouble();
		System.out.println("enter the no of year");
		n=sc.nextInt();
		a=b*Math.pow(1+r/100,n);
		System.out.println("maturity amount"+a);
		break;
	case 2:
		System.out.println("enter the principle amount,intrest rate");
		p=sc.nextDouble();
		System.out.println("enter the intrest rate");
		r=sc.nextDouble();
		System.out.println("enter the no of year");
		n=sc.nextInt();
		a=p*n+p*((n*(n+1))/2)*(r/100)*(1/12.0);
		System.out.println("maturity amount"+a);
		break;
		default :
			System.out.println("invalid number");
			

	}
			
	
}
}
