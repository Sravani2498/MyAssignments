package week1.assignment;

public class Palindrome {

	public static void main(String[] args) {
		
		int no=12345;
		int temp=no;
		int rev =0,rem;
		while(temp!=0)
		{
			rem=temp%10;
			rev=(rev*10)+rem;
			temp=temp/10;
			
		}
		
		if(temp==rev)
		{
			System.out.println( no +"the given no is palindrome");
			
		}else
		{
			System.out.println( no +"the given no is not a palindrome");
		}
		// TODO Auto-generated method stub

	}

}
