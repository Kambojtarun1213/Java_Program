package Unit_01;
/*
 * The wrapper class in java provides the mechanism to convert a primitive into object 
 * why ? 
 * Because we want to use predefined methods of those objects 
 * - boolean data types -> Boolean obj ; -> obj.toString()  ; 
 */
public class P4_Task02_WrapperClassesInJava {

	public static void main(String[] args) {
		// Converting int into integer 
		int a = 20 ; 
		String s = "" + a + "" ; 
		Integer i = Integer.valueOf(a) ;  // converting int into Integer explicitly
		Integer j = a ; // autoboxing, now compiler will write Integer.valueof(a) internally 
		System.out.println(a+ " "+i+" "+j);
		System.out.println(i.toString());
		// a.toString() can not be done due to a is int not object
		byte b = 10 ; 
		Byte byteobj = b ; 
		System.out.println(byteobj);
		
		// unboxing converting objects to primitives 
		byte bytevalue = byteobj ; 
		System.out.println(bytevalue);

	}

}