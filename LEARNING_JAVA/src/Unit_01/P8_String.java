package Unit_01;

/* Problem Statement:
P8_String: 
(Create separate logic in separate function)
F1 - Check the entered string is palindrome or not? 
  		String s = "75457"
  		Output: Yes it is a palindrome or No it is not a palindrome.
F2 - Make a reverse of a string using?
F3 - String Compare: Check if the strings are equal or not?
 * */

public class P8_String {

	public static void main(String[] args) {

		QuestionsOnString obj = new QuestionsOnString();

		String s1 = new String("75457");
		String s2 = new String("7545a");

		obj.palindromeOrNot(s1);
		obj.reverseOfAString(s1);
		obj.stringEqualOrNot(s1, s2);

	}

}

class QuestionsOnString {

	void palindromeOrNot(String s) {
		String s2 = ""  ; 
		for(int i=0; i<s.length(); i++)
		{
			char ch = s.charAt(i) ; 
			s2 = ch + s2 ; 
		}
		if(s.equals(s2))
		{
			System.out.println("Yes it is a Pallindrome"); 
		}
		else 
			System.out.println("Yes it is not a Pallindrome"); 

	}

	void reverseOfAString(String s) {
		String s2 = "";
		for(int i=0; i<s.length(); i++)
		{
			char c = s.charAt(i) ; 
			s2 = c+s2 ; 
		}
		System.out.println(s2);

	}
	
	void stringEqualOrNot(String s1,String s2) {
		boolean r = s1.equals(s2) ; 
		if(r)
		  System.out.println("Both string are equal");
		else
			System.out.println("Both string are not equal");
	}
}