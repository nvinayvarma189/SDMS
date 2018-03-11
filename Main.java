import java.io.*;
import java.util.*;
class Main extends StudentDairy{
	public static void main(String args[]) throws Exception
	{
		Student student = new Student(); //object of student
		Councellor councellor = new Councellor(); //object of councellor(faculty member assigned to a particular class)
		Faculty faculty = new Faculty();// object of faculty (we have 4subjects maths, digiital circuits, oops, data structure)
		 int s_number;
		 int p_number;
		 councellor.inputdetails();
		while(true)
		{
			Home home = new Home();
			home.printHome();
			home.getInputHome();
			home.printOptionHome();
			if(home.optionhome ==1) //selected as student
			{
			if(home.optionstudent==1)	//Student options
				{
				   System.out.println("Enter your roll no"); //viewing details
				   Scanner ss = new Scanner(System.in);
				   s_number = ss.nextInt();
				   councellor.printdetails(s_number);
				}
					if(home.optionstudent == 2 )
						{
							faculty.getjava(); //viewing marks and attendance for different subjects
							faculty.getdsa(); //only will be visible if faculty already entered marks
							faculty.getdc();
							faculty.getmaths();
						}
						if(home.optionstudent == 3 ) //to view the number of duty leaves he has got sanctioned
						{
							councellor.viewDutyLeaves();
						}
			}
			if(home.optionhome == 4) //faculty
			{
				if(home.optionfaculty2 == 1)
				{
					if(home.optionfaculty == 1)
					{
						faculty.calljava();
					}
					if(home.optionfaculty == 2)
					{
						faculty.callds();
					}
					if(home.optionfaculty == 3)
					{
						faculty.calldc();
					}
					if(home.optionfaculty == 4)
					{
						faculty.callmaths();
					}
				}
			else if(home.optionfaculty2==2)
			{
				if(home.optionfaculty == 1)
				{
					faculty.getjava();
				}
				if(home.optionfaculty == 2)
				{
					faculty.getdsa();
				}
				if(home.optionfaculty == 3)
				{
					faculty.getdc();
				}
				if(home.optionfaculty == 4)
				{
					faculty.getmaths();
				}
			}

			}

			if(home.optionhome==3) //councellor
			{
				if(home.optionCouncellor==1)
				{
					councellor.displayStudents();
				}
				else if(home.optionCouncellor == 2){
					faculty.getjava();
					faculty.getdsa();
					faculty.getdc();
					faculty.getmaths();
			}
				else if(home.optionCouncellor==3){
					councellor.addStudents();
					councellor.displayStudents();
				}
				else if(home.optionCouncellor==4)
				{

						councellor.viewBehaviour();
				}
					else if(home.optionCouncellor == 5)
					{
						councellor.inputBehaviour();
					}
					else if(home.optionCouncellor == 6)
					{
						councellor.inputDutyLeaves();
					}
					else if(home.optionCouncellor == 7)
					{
						councellor.viewDutyLeaves();
					}
				}

				if(home.optionhome==2) //parent
				{

					Scanner ss = new Scanner(System.in);
					if(home.optionparent==1)
								{
									System.out.println("Enter your child's roll no");

									s_number = ss.nextInt();
									councellor.printdetails(s_number);
								}
									if(home.optionparent == 2 )
									{
										faculty.getjava();
										faculty.getdsa();
										faculty.getdc();
										faculty.getmaths();
									}
								if(home.optionparent ==3)
								{
									//  System.out.println("Enter your child's roll no");
									//  p_number = ss.nextInt();
									 councellor.viewBehaviour();
								}
				}


			}
		}
}
