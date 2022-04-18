package Unit_01;
//sortig
//findduplicate
//findsecondlargestandsecondsmallest
//findleftrotation
//removearray
import java.util.Scanner ; 
public class Array {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in) ; 
		questionsonarray obj=new questionsonarray();
		System.out.println("Enter the number ");
		int n = sc.nextInt() ; 
		int a[]= new int[n],i;
		System.out.println("Enter the value");
		for(i=0; i<n; i++)
		{
			a[i] = sc.nextInt() ; 
		}
		
		obj.sortarray(a);
		obj.duplicate(a);
		obj.leftrotation(a);
		obj.removearray(a);
	}
	

}
class questionsonarray
{
	void sortarray(int a[])
	{
		for( int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
			
		}System.out.println("array after sorting");
		for( int i=0;i<a.length;i++)
		{
			System.out.print(a[i] + " ");
		}
		
		System.out.println();
	}
	void duplicate(int a[])
	{
		int c=0;
		for(int i=0;i<a.length;i++)
		{
			 int k=0;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					k++;
				}
			}
		
		if(k>0)
		{
		  System.out.println("duplicate array is"+a[i]);
		  c++;
		}
		
		}
		if(c==0)
		{
			System.out.println("no duplicate found");
		}
	}
	void leftrotation(int a[ ])
	{
		int i;
		int temp=a[0];
		for(i=0;i<a.length-1;i++)
			a[i]=a[i+1];
		a[i]=temp;
		for(i=0;i<a.length;i++)
		 System.out.print(a[i] +" ");
	}
	
	void removearray(int a[])
	{
		int t = 7, i ; 
		for(i=0; i<a.length; i++) {
			if(a[i]==t) {
				break ; 
			}
		}
		for( ; i<a.length-1; i++) {
			a[i] = a[i+1] ; // 3 5 7 8 9
		}
		System.out.println();
		for(i=0; i<a.length-1; i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}