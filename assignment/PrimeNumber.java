package week1.assignment;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int no=13;
		boolean prime=true;
		for(int i=2;i<no;i++)
		{
			if(no%i==0)
			{
				prime=false;
			}
		}
		
		if(prime==true)
		{
			System.out.println("the given no is aprime no");
		}else
		{
			System.out.println("the given no is not a primenumber");
		}
		
		// TODO Auto-generated method stub

	}

}
