package week3.assignment;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		String test="changeme";
		System.out.println(test);
		char[] charArray=test.toCharArray();
		for (int i = 0; i <charArray.length; i++) {
			char c=charArray[i];
			
			if (i %2 !=0) {
				System.out.print(Character.toUpperCase(c));
				
			} else {
				System.out.print(Character.toLowerCase(c));

			}
			
			
		}
		
	}

}
