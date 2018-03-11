import java.util.*;
import java.io.*;
class Councellor extends StudentDairy
	{
			Student student = new Student(); //another object created.
	public void displayStudents() throws Exception //get data from the file.
	{
		BufferedReader r = new BufferedReader( new FileReader("Student.txt") );
String s = "", line = null;
while ((line = r.readLine()) != null) {
		System.out.println(line);
	}
}

public void addStudents() throws Exception //adding the students
{
  //storing in the file.
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

public void inputdetails() //inputting the details of a new students.
{
	student.putdetails();
}
public void printdetails( int s_number) //getting the information of student.
{
	student.getDetails(s_number);
}

public void viewBehaviour() //to view the behaviour of the student.
{
	Scanner s = new Scanner(System.in);
	System.out.println("Enter roll number of student");
	int number=s.nextInt();
	student.behaviour(number);
}

public void inputBehaviour() // to input the behaviour of the student.
{
	Scanner s = new Scanner(System.in);
	System.out.println("Enter roll number of student");
	int number=s.nextInt();
	System.out.println("Enter behaviour of "+number);
	String sbehaviour = s. next();
	student.updatebehaviour(number,sbehaviour);
}
public void viewDutyLeaves() //to view the number of duty leaves a student got.
{
	Scanner s = new Scanner(System.in);
	System.out.println("Enter roll number of student");
	int number=s.nextInt();
	student.viewdutyleave(number);
}
public void inputDutyLeaves() //to input the number of duty leaves for a student.
{
	Scanner s = new Scanner(System.in);
	System.out.println("Enter roll number of student");
	int number=s.nextInt();
	System.out.println("Enter number of duty leaves");
	int numberdutyleaves = s. nextInt();
	student.inputdutyleave(number,numberdutyleaves);
}


}
