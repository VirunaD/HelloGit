package aruna;

public class StudentData 
{
	int id;
	String name;
	void insertrecord(int i, String n)
		{
			id=i;
			name=n;
		}
	void displayInformation()
		{
			System.out.println(id+""+name);
		}
	public static void main(String[] args) 
		{
			StudentData s1= new StudentData();
			StudentData s2=new StudentData();
			s1.insertrecord(11,"Vishal");
			s2.insertrecord(22,"Aruna");
			s1.displayInformation();
			s2.displayInformation();
			
			
		}

}
