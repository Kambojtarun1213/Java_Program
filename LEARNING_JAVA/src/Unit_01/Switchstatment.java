package Unit_01;

public class Switchstatment {
	 public static void main(String[] args)
	 {
		questioninjava obj= new questioninjava();
		 String s1=new String("75457");
		 String s2=new String("7545a");
		 
		 
		 obj.palindrome(s1);
		 obj.palindrome(s2);
		 obj.reversestring(s2);
		 obj.equalornot(s1,s2);
	 }

}
 class questioninjava {
	void palindrome(String s)
	{
		String s2= "" ;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
	      	s2=ch + s2;
	      	
		} 
		if(s.equals(s2))
		{
			System.out.println("number is palindrome");
		}
			else 
			{
				System.out.println("number is not palindrome");
		
			}
	}
	void reversestring(String s)
	{
		String s2="";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
	      	s2=ch + s2;
	      	
		} 
		System.out.println(s2);
	}
	void equalornot(String s1, String s2)
	{
	boolean r=s1.equals(s2);
	if(r)
	{
	System.out.println("number is equal");	
	}
	else
		System.out.println("number is nit equal");
	}
 }