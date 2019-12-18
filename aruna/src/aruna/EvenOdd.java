package aruna;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number");
		int Num=sc.nextInt();
		if(Num%2==0)
		{
			System.out.println(" Number is Even");
		}
		else
		{
			System.out.println(" Number is odd");
		}
	}

}
