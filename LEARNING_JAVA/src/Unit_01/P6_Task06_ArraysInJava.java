package Unit_01;
/*
 *  - Normally an array is a collection of similar type of elements which has the contiguous memory locations
 *  - Java array is object which contains the elements of similar data type 
 *  - we can store only a fixed set of element in a java array
 *  
 *  - Size limit issue 
 *    - We can store only the fixed sized of element in the array
 *    - it size does not grow at runtime
 *    - To solve this problem collection framework is used in Java which grows automatically
 *    
 *  - There are two types of array 
 *   - Single dimensional array 
 *   - Multidimensional array
 *  - Declare an Array In java 
 *    dataType arrayName[] ; 
 *      Or
 *    dataType[] arrayName ; 
 *      Or 
 *    dataType []arrayName ; 
 *    
 *    - Instantiation of an array in java 
 *      - arrayRefvar
 */
public class P6_Task06_ArraysInJava {

	public static void main(String[] args) {
		// Declaration ; 
		int array1[] ; 
		int[] array2[] ; 
		int []array3  ;
		
		// array1[0] = 2 
		// can not do it as we have not provide it any memory/space yet 
		
		// initialization, during initialization we have to provide the size of the array ; 
		array1 = new int[6] ; 
		for(int i=0; i<array1.length; i++) // length is the property of the array 
			array1[i] = i ; 
	    
		int []array4 = {3, 4, 5, 6,7} ; //declaration, instantiation and initialization 
		
		// Passing array to the method 
		arrayAsParameter(array4) ; 
		
		// Passing anonymous array in a method 
		arrayAsParameter(new int [] {5,6,8,7}) ; 
		
		// Returning Array from the method 
		int array[5] = arrayAsReturnType() ; 
		System.out.println(array5.toString());
		
		// Array out of Bounded Exception 
		int arr[] = {50, 60, 45, 78} ; 
		for(int i = 0 ; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		
		// Multidimensional Array In Java 
		int [][] arr6 = new int [3][3] ;  // 3 row and 3 column 
		for(int i=0; i<arr6.length; i++)
		{
			for(int j=0; j<arr6.length ; j++)
			{
				System.out.println(arr6[i][j]);
			}
		}

	}
	static void arrayAsParameter(int []arr) // declare emoty array as parameter 
	{
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}
	// Returning the array from the method 
	static int[] arrayAsReturnType()
	{
		int arr[] = {32,45,8,9,4,7} ; 
		
		return arr ; 
	}

}