import java.util.*;
import java.io.*;
class Home extends StudentDairy
{
	Scanner s= new Scanner(System.in);
	public int optionhome;
	public int optionCouncellor;
	public int optionstudent;
	public int optionparent;
	public int optionfaculty;
	public int optionfaculty2;
	public int optiondutyleave;
	public void printHome()
	{
		System.out.println();
		System.out.println("Enter the mode of login");
		System.out.println("1.Stundent");
		System.out.println("2.Parent");
		System.out.println("3.Councellor");
		System.out.println("4.Faculty");
		System.out.println("5.exit");
		System.out.println();
		System.out.println("(Enter the number)");
	}
	public void getInputHome(){
		optionhome = s.nextInt();
	}
	public void printOptionHome(){
		if(optionhome==1)
		{	System.out.println("You selected Student");
			System.out.println("Select an operation");
			System.out.println("1.View your details");
			System.out.println("2.View your marks and Attendance");
			System.out.println("3.View number of duty leaves");
			optionstudent = s.nextInt();
				}
		else if(optionhome==2)
			{
				System.out.println("You selected Parent");
				System.out.println("Select an operation");
				System.out.println("1.View your child's details");
				System.out.println("2.View your child's marks and Attendance");
				System.out.println("3.View your child's Behaviour");
				optionparent=s.nextInt();
			}
		else if(optionhome==3){
			System.out.println("You selected Councellor");
			System.out.println("Select an operation");
			System.out.println("1.View students details");
			System.out.println("2.view students marks and Attendance");
			System.out.println("3.add Student");
			System.out.println("4.view behaviour");
			System.out.println("5.input behaviour");
			System.out.println("6.input Duty leaves");
			System.out.println("7.view number of Duty leaves");
			 optionCouncellor =  s.nextInt();
		}
		else if(optionhome == 4)
			{
				System.out.println("You selected Faculty");
				System.out.println("Select subject");
				System.out.println("1.Java");
				System.out.println("2.Dsa");
				System.out.println("3.Dc");
				System.out.println("4.maths");
				optionfaculty = s.nextInt();
				System.out.println("chose operation");
				System.out.println("1.Input marks and Attendance");
				System.out.println("2.print marks and Attendance");
				optionfaculty2 = s.nextInt();
			}

		else
			System.exit(0);
	}
}
