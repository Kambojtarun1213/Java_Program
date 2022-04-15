package Unit_01;

/* Tasks given below:
		obj.sortAnArray(array);
		obj.findTheDuplicateElements(array);
		obj.findSecondLargestAndSecondSmallestElement(array);
		obj.leftRotationInAnArray(array); 
		obj.removeElementInArray(array);//(Optional)
 */

public class P9_Array {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5, 4, 6, 2, 3 };

		QuestionsOnArray obj = new QuestionsOnArray();
		obj.sortAnArray(array);
		obj.findTheDuplicateElements(array);
		obj.findSecondLargestAndSecondSmallestElement(array);
		obj.leftRotationInAnArray(array);
		obj.removeElementInArray(array); 

	}

}

class QuestionsOnArray {

	void sortAnArray(int[] a) {
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a.length-i-1; j++)
			{
				if(a[j]>a[j+1])
				{
					int t = a[j] ; 
					a[j] = a[j+1] ; 
					a[j+1] = t ; 
				}
			}
		}
		System.out.println("Arrya after the sorting ");
		for(int i=0; i<a.length ; i++)
		{
			System.out.print(a[i] + " ");
		}
		System.out.println();

	}

	void findTheDuplicateElements(int[] a) {
		for(int i=0; i<a.length; i++)
		{
			int k = 0 ;
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]==a[j])
				{
					k++ ; 
				}
			}
			if(k>0)
				System.out.println("Dublicate is "+a[i]);
		}

	}

	void findSecondLargestAndSecondSmallestElement(int[] a) {
		int large  = a[0] ; 
		int small  = 10 ; 
		int slarge = a[0] ; 
		int ssmall = 5 ; 
		for(int i=0; i<a.length; i++)
		{
			if(a[i]>large)
			{
				slarge = large ; 
				large = a[i] ; 
			}
			
			if(a[i]<small)
			{
				ssmall = small ; 
				small = a[i] ; 
			}
			else if(a[i]<ssmall && a[i] != small)
				ssmall = a[i] ; 
		}
		System.out.println("Second Largest is " + slarge + " Second Smallest is "+ssmall);

	}

	void leftRotationInAnArray(int[] a) {
		int a1 = a[0] ; 
		int b = a[1] ; 
		int i ; 
		for(i=0; i<a.length-2; i++)
		{
			a[i] = a[i+2] ; 
		}
		a[i] = b ; 
		a[i+1] = a1 ; 
		System.out.println("Array after the left rotations");
		for(i=0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();

	}

	void removeElementInArray(int[] a) {
		int b = 5 ;  // i went to 5 from the array
		int i, j ; 
		for(i=0; i<a.length; i++)
		{
			if(a[i]==b)
			{
				break ; 
			}
		}
		for(j=i; j<a.length-1; j++)
		{
			a[j] = a[j+1] ; 
		}
		System.out.println("Array after the removing of 5");
		for(i=0; i<a.length-1; i++)
		{
			System.out.print(a[i] + " ");
		}
	}
    
}