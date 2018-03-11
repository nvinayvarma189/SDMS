import java.io.*;
import java.util.*;
class Main extends StudentDairy{
	public static void main(String args[]) throws Exception
	{
		Student student = new Student(); //object of student.
		Councellor councellor = new Councellor(); //object of councellor(faculty member assigned to a particular class).
		Faculty faculty = new Faculty();// object of faculty (we have 4subjects maths, digiital circuits, oops, data structure).
		 int s_number;
		 int p_number;
		 councellor.inputdetails();
		while(true)
		{
			Home home = new Home();
			home.printHome();
			home.getInputHome();
			home.printOptionHome();
			if(home.optionhome ==1) //selected as student.
			{
			if(home.optionstudent==1)	//Student options.
				{
				   System.out.println("Enter your roll no"); //viewing details.
				   Scanner ss = new Scanner(System.in);
				   s_number = ss.nextInt();
				   councellor.printdetails(s_number);
				}
					if(home.optionstudent == 2 )
						{
							faculty.getjava(); //viewing marks and attendance for different subjects.
							faculty.getdsa(); //will be only visible if faculty already entered marks.
							faculty.getdc();
							faculty.getmaths();
						}
						if(home.optionstudent == 3 ) //to view the number of duty leaves he has got sanctioned.
						{
							councellor.viewDutyLeaves();
						}
			}
			if(home.optionhome == 4) //faculty.
			{
				if(home.optionfaculty2 == 1) //selecting the subject.
				{
					if(home.optionfaculty == 1) // Java faculty.
					{
						faculty.calljava(); 
					}
					if(home.optionfaculty == 2) // Data Structures faculty.
					{
						faculty.callds();
					}
					if(home.optionfaculty == 3) // Digital circuits faculty.
					{
						faculty.calldc();
					}
					if(home.optionfaculty == 4) //Maths Faculty.
					{
						faculty.callmaths();
					}
				}
			else if(home.optionfaculty2==2) //to view the details.
			{
				if(home.optionfaculty == 1) //for java.
				{
					faculty.getjava();
				}
				if(home.optionfaculty == 2) //for Data Structures.
				{
					faculty.getdsa();
				}
				if(home.optionfaculty == 3) //for digital circuits.
				{
					faculty.getdc();
				}
				if(home.optionfaculty == 4) //for mathematics.
				{
					faculty.getmaths();
				}
			}

			}

			if(home.optionhome==3) //councellor options displayed.
			{
				if(home.optionCouncellor==1) //to see the details of the students.
				{
					councellor.displayStudents();
				}
				else if(home.optionCouncellor == 2){ //to view the academic details of subjects uploade by the respective faculty.
					faculty.getjava();
					faculty.getdsa();
					faculty.getdc();
					faculty.getmaths();
			}
				else if(home.optionCouncellor==3){ //adding a new student to the databadse.
					councellor.addStudents();
					councellor.displayStudents();
				}
				else if(home.optionCouncellor==4) //to view the behaviour of a student after uploading it.
				{
					//only viewable by the councellor, parent of the student, faculty. The student cannot see this.
						councellor.viewBehaviour();
				}
					else if(home.optionCouncellor == 5) // inputting the behaviour of a student in the class.
					{
						councellor.inputBehaviour();
					}
					else if(home.optionCouncellor == 6) // inputting the number of details sanctioned to a student. 
					{
					// only viewable by the student, councellor, faculty.
						councellor.inputDutyLeaves();
					}
					else if(home.optionCouncellor == 7) // the councellor can see how many duty leaves the student got.
					{
					// only viewable by the student, councellor, faculty.
				        	councellor.viewDutyLeaves();
					}
				}

				if(home.optionhome==2) //parent options
				{
					Scanner ss = new Scanner(System.in);
					if(home.optionparent==1) //viewing their child's details.
					 	{
			            			System.out.println("Enter your child's roll no");
							s_number = ss.nextInt();
							councellor.printdetails(s_number);
						}
					if(home.optionparent == 2 ) //viewing their child's academic details.
						{
							faculty.getjava();
							faculty.getdsa();
							faculty.getdc();
							faculty.getmaths();
						}
					if(home.optionparent ==3) // to view the behaviour their child.
					{
						//cannot be viewed by the student.
						 councellor.viewBehaviour();
								}
				}


			}
		}
}
