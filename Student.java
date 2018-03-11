import java.util.*;
import java.io.*;
class Student extends StudentDairy
	{
		public HashMap<Integer,String> h1 = new HashMap<Integer,String>();
		public HashMap<Integer,String> h2 = new HashMap<Integer,String>();
		public HashMap<Integer,String> h3 = new HashMap<Integer,String>();
		public HashMap<Integer,String> h4 = new HashMap<Integer,String>();
		public HashMap<Integer,Integer> h5 = new HashMap<Integer,Integer>();
		// public HashMap<Integer,List<Integer>> h5 = new HashMap<Integer,List<Integer>>();

		public void putdetails() //initiall 3 students are taken into consideration.
		{
			h1.put(16505,"Vinay");
			h1.put(16506,"Srinivas");
			h1.put(16508,"Venu");
			h2.put(16505,"vizag");
			h2.put(16506,"Guntur");
			h2.put(16508,"hyd");
			h3.put(16505,"7732092345");
			h3.put(16506,"8954763214");
			h3.put(16508,"7893254566");
			h4.put(16505,"none");
			h4.put(16506,"none");
			h4.put(16508,"none");
			h5.put(16505,0);
			h5.put(16506,0);
			h5.put(16508,0);

		}
		public void getDetails(int number) //get details of the student.
		{
			System.out.println("Name: "+h1.get(number));
			System.out.println("Place: "+h2.get(number));
			System.out.println("Phone number: "+h3.get(number));
		}
		public void viewdutyleave( int number) //to view the number of duty leaves.
		{
			System.out.println("Number of duty leaves approoved "+h5.get(number));
		}
		public void inputdutyleave( int number, int numberdutyleaves) //storing the number of duty leaves.
		{
			this.h5.put(number,numberdutyleaves);
		}
		public void behaviour(int number) //to get the behaviour
		{
		//called by the councellor.
		//this is placed here but cannot be viewed by the student.
			if(this.h4.get(number) != null )
						System.out.println("Behaviour: "+h4.get(number));
			else
						System.out.println("Student not found");
		}
		public void updatebehaviour(int number,String sbehaviour) //called by the councellor.
		{
			if(this.h4.get(number) != null)
			{
				this.h4.put(number,sbehaviour);
			}
			else
				System.out.println("No student found");

		}
		public void addedStudents(String name,String place,int rollno,String phn) //called by the councellor.
		{
			this.h1.put(rollno,name);
			this.h2.put(rollno,place);
			this.h3.put(rollno,phn);
			this.h4.put(rollno,"Not entered");
			System.out.println("Im here");
		}

	public void readData() throws Exception //reaading data from text.
	{
		BufferedReader r = new BufferedReader( new FileReader( "16505.txt" ) );
String s = "", line = null;
while ((line = r.readLine()) != null) {
		System.out.println(line);
		}
	}
}
