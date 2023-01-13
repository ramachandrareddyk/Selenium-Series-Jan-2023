package seleniumSessions;

import java.util.Arrays;

public class Hello {
	public static void main(String[] args) {
		
		  String str1="he is a boy"; 
		  String str2 = "si a eh oby";
		 
			/*
			 * String str1 = "Race"; String str2 = "Care";
			 */
		    
		    str1 = str1.toLowerCase();
		    str2 = str2.toLowerCase();

		    // check if length is same
		    if(str1.length() == str2.length()) {

		      // convert strings to char array
		      char[] charArray1 = str1.toCharArray();
		      char[] charArray2 = str2.toCharArray();

		      // sort the char array
		      Arrays.sort(charArray1);
		      Arrays.sort(charArray2);

		      // if sorted char arrays are same
		      // then the string is anagram
		      boolean result = Arrays.equals(charArray1, charArray2);

		      if(result) {
		        System.out.println(str1 + " and " + str2 + " are anagram.");
		      }
		      else {
		        System.out.println(str1 + " and " + str2 + " are not anagram.");
		      }
		    }
		    else {
		      System.out.println(str1 + " and " + str2 + " are not anagram.");
		    }
		
/*//		if(str.equals(str1)) {
//			System.out.println(".equals compare the content");
//		}else if(str==str1) {
//			System.out.println("== compare the reference comparesion");
//		}else {
//			System.out.println("not comparing");
//		}
		
		
		System.out.println(str.equals(str1));
		System.out.println(str.equalsIgnoreCase(str1));
		System.out.println(str.contentEquals(str1));
		
		
		
//		System.out.println(str.equals(new StringBuilder(str1).reverse().toString()));
		
//		System.out.println(str.compareToIgnoreCase(str1));
			
//		System.out.println(str.compareTo(str1));
		
//		System.out.println(reverse());
	
		

//	public boolean reverse() {
//		String str="he is a boy";
//		String str1 = "si a eh oby";
//		
//		for(int i = 0; i< str1.length();i++){
//			   if(str[i] != str1[str1.length-i-1])
//			       return false;
//			} 
//			return true;
	}
	
//	public static  boolean reverse() {
//		String str="he is a boy";
//		String str1 = "si a eh oby";
//		String reverse = new StringBuffer(str).reverse().toString();
//		return reverse.equals(str1);
//	}
*/
	}

}
