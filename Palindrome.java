package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 343;
		int remainder = 0;
		int check = 0;
		int original = num;
		
		while (num>0) {
			
			remainder = num%10;
			check = (check*10)+remainder;
			 num = num/10;
		}
		
		if(original==check) {
			
			System.out.println("Its a palindrome number");
		}
	
		
		else {
			
			System.out.println("Number is not a palindrome");
		}
	}

}
