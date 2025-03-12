import java.util.*;

class lectureTwelve{
    public static void main (String [] args){
        //String in java
		
		//initialising a string 
		String str1 = "hello";
		String str2 = "world";
		Scanner sc = new Scanner(System.in);
		String firstName = sc.next();
		String lastName = sc.next();
		String fullName = firstName +"@"+ lastName ; //this @ string will be deleted after the 12 line of code is executed
		System.out.println(fullName);
		
		
		//Methods with String
		System.out.println(fullName.length());
		System.out.println(fullName.charAt(3)); //0 based indexing
		//if str1 > str2 => +ve value
//			 str1 == str2 => 0 
//		     str1 < str2 => -ve value
		System.out.println(str1.compareTo(str2)); 
		System.out.println(fullName.substring(1,5));
    }
}