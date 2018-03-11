import java.util.*;
import java.io.*;
class Faculty extends StudentDairy
	{
    Scanner s = new Scanner(System.in);
    int mrollno;
    FacultyJava facultyjava = new FacultyJava(); //Java object.
    FacultyDc facultydc = new FacultyDc(); //Digigtal Circuits object.
    FacultyMaths facultymaths = new FacultyMaths(); //Maths object.
    FacultyDsa facultydsa = new FacultyDsa(); //Data Stuctures object.
    public void calljava() //to input marks/attendance for a student by the Java faculty.
    {
      System.out.println("Enter rollno");
      mrollno = s.nextInt();
      facultyjava.inputjavamarks(mrollno);
      facultyjava.inputjavaAttendance(mrollno);

    }
    public void callds() //to input marks/attendance for a student by the Data Structures faculty.
    {
      System.out.println("Enter rollno");
      mrollno = s.nextInt();
      facultydsa.inputdsamarks(mrollno);
      facultydsa.inputdsaAttendance(mrollno);
    }
    public void calldc() //to input marks/attendance for a student by the Digital Circuits faculty.
    {
      System.out.println("Enter rollno");
      mrollno = s.nextInt();
      facultydc.inputdcmarks(mrollno);
      facultydc.inputdcAttendance(mrollno);
    }
    public void callmaths() //to input marks/attendance for a student by the Maths faculty.
    {
      System.out.println("Enter rollno");
      mrollno = s.nextInt();
      facultymaths.inputmathsmarks(mrollno);
      facultymaths.inputmathsattendance(mrollno);
    }
    public void getjava() //to the marks/attendance for a student in Java.
    {
      System.out.println("Enter rollno");
      mrollno = s.nextInt();
      facultyjava.getjavamarks(mrollno);
    }
    public void getdsa() //to the marks/attendance for a student in Data Structures.
    {
      System.out.println("Enter rollno");
      mrollno = s.nextInt();
      facultydsa.getdsamarks(mrollno);
    }
    public void getdc() //to the marks/attendance for a student Digital Circuits.
    {
      System.out.println("Enter rollno"); 
      mrollno = s.nextInt();
      facultydc.getdcmarks(mrollno);
    }
    public void getmaths() //to the marks/attendance for a student Maths.
    {
      System.out.println("Enter rollno");
      mrollno = s.nextInt();
      facultymaths.getmathsmarks(mrollno);
    }
}
