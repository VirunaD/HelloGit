package aruna;

public class AnnonymousCalculation 
{
	
	void fact(int n)
	{
		int fact=1,i;
		for(i=1; i<=n; i++);
			{
				fact=fact*i;
			}
		System.out.println("Factorial is:"+fact);
		System.out.println("Editing");
	}
	public static void main(String[] args) 
	{
		new AnnonymousCalculation().fact(5);
	}

}
