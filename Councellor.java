import java.util.*;
import java.io.*;
class Councellor extends StudentDairy
	{
			Student student = new Student();
	public void displayStudents() throws Exception
	{
		BufferedReader r = new BufferedReader( new FileReader("Student.txt") );
String s = "", line = null;
while ((line = r.readLine()) != null) {
		System.out.println(line);
}
}

// public void displayAttendance() throws Exception
// {
// 	faculty.getjava();
// 	faculty.getdsa();
// 	faculty.getdc();
// 	faculty.getmaths();
// }

public void addStudents() throws Exception
{
  BufferedWriter bw = new BufferedWriter(new FileWriter ("Student.txt",true));
  Scanner s = new Scanner(System.in);
  System.out.println("Input name");
  String  name = s.nextLine();
  bw.write("\n");
  bw.write("Name:"+name);
  bw.write("\n");
  System.out.println("Input place");
  String  place = s.nextLine();
  bw.write("Place:"+place);
  bw.write("\n");
	System.out.println("Input Roll number");
  int rollno = s.nextInt();
  bw.write("Roll number:"+rollno);
  bw.write("\n");
  System.out.println("Input phone number");
  String  phn = s.next();
  bw.write("Phone number:"+phn);
  bw.write("\n");
  // bw.newLine();
  bw.close();
	student.addedStudents(name,place,rollno,phn);
}

public void inputdetails()
{
	student.putdetails();
}
public void printdetails( int s_number)
{
	student.getDetails(s_number);
}

public void viewBehaviour()
{
	Scanner s = new Scanner(System.in);
	System.out.println("Enter roll number of student");
	int number=s.nextInt();
	student.behaviour(number);
}

public void inputBehaviour()
{
	Scanner s = new Scanner(System.in);
	System.out.println("Enter roll number of student");
	int number=s.nextInt();
	System.out.println("Enter behaviour of "+number);
	String sbehaviour = s. next();
	student.updatebehaviour(number,sbehaviour);
}
public void viewDutyLeaves()
{
	Scanner s = new Scanner(System.in);
	System.out.println("Enter roll number of student");
	int number=s.nextInt();
	student.viewdutyleave(number);
}
public void inputDutyLeaves()
{
	Scanner s = new Scanner(System.in);
	System.out.println("Enter roll number of student");
	int number=s.nextInt();
	System.out.println("Enter number of duty leaves");
	int numberdutyleaves = s. nextInt();
	student.inputdutyleave(number,numberdutyleaves);
}


}
