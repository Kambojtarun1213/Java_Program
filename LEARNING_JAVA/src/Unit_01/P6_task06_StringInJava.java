package Unit_01;

public class P6_task06_StringInJava {

	public static void main(String[] args) {
		StringInJava obj = new StringInJava() ; 
        obj.stringDefinition() ; 
        obj.charAndString() ; 

	}

}
class StringInJava
{
	void stringDefinition()
	{
		String s = "Hello World" ; 
		String s1 = new String("Welcome in java") ; 
		
		System.out.println(s);
		// Get length of a string 
		System.out.println(s.length());
		
		// loop through the string 
		for(int i=0; i<s.length(); i++)
		{
			System.out.println(s.charAt(i));
		}
		
		String first = "Dikshant" ; 
		String second = "Kamboj"  ; 
		
		// compare two string 
		boolean results = first.equals(second) ; 
		System.out.println(results);
		
		/*
		 *  Java String are immutable 
		 *  In Java the JVM maintains a string pool to store all of its strings inside the memory 
		 *  The string pool helps in reusing the strings 
		 *  -  If the string already exists, the new string is not created 
		 *  -  Instead the new reference, example points to the already existed string(java).
		 *  -  If the string doesn't exists, the new string (java is created)
		 */
		String fourth = "Dikshant" ; 
		String fifth = new String("Kamboj") ; 
	}
	/* 
	 * Character Arrays are mutable but String are not 
	 */
	void charAndString()
	{
		char []ch = {'H','E','L','L','L','O', 'W','O','R','L','D'} ; 
		char ch1[] = {'f','i','n','e'} ; 
		
		System.out.println(ch);
		for(int i=0; i<ch.length; i++)
		{
			System.out.println(ch[i]);
		}
		
		//Converting of character array into the string 
		String s1 = new String(ch) ; 
		System.out.println(s1);
		
		// Character array are mutable but string are not 
		ch[0] = 'h' ; 
		// s1.chatAt(0) = 'h' ; 
		
		s1 = s1 + 'a' ; // s1 is the new object in the memory
		//ch = ch + ch2 ; 
		
		// String to char array
		String s2 = "GEEKS" ; 
		char[] ch4 = s2.toCharArray() ; 
		
		// char to string
		char []a2 = {'A', 'L', 'L' } ; 
		String s3 = new String() ; 
	}
}