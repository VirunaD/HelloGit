package aruna;

public class methodoverloading 
{
	void sum(int a, int b)
	{
		System.out.println(a+b);
	}
	void sum(int a, int b, int c)
	{
		System.out.println(a+b+c);
	}
	public static void main(String[] args) 
	{
		methodoverloading m=new methodoverloading();
		m.sum(10,12);
		m.sum(10, 20, 30);
	}

}
