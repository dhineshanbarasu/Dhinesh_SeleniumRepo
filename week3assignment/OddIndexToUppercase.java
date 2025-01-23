package week3.week3assignment;

public class OddIndexToUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String test = "changeme";
		
	
		char[] cArray = test.toCharArray();
		
		for (int i = 0; i < cArray.length; i=i+2) {
			
			cArray[i] = Character.toUpperCase(cArray[i]);
			
		}
			
		System.out.println(cArray);
		}
		
	}
	



