import java.util.*;
import java.io.*;
class Faculty extends StudentDairy
	{
    Scanner s = new Scanner(System.in);
    int mrollno;
    FacultyJava facultyjava = new FacultyJava();
    FacultyDc facultydc = new FacultyDc();
    FacultyMaths facultymaths = new FacultyMaths();
    FacultyDsa facultydsa = new FacultyDsa();
    public void calljava()
    {
      System.out.println("Enter rollno");
      mrollno = s.nextInt();
      facultyjava.inputjavamarks(mrollno);
      facultyjava.inputjavaAttendance(mrollno);

    }
    public void callds()
    {
      System.out.println("Enter rollno");
      mrollno = s.nextInt();
      facultydsa.inputdsamarks(mrollno);
      facultydsa.inputdsaAttendance(mrollno);
    }
    public void calldc()
    {
      System.out.println("Enter rollno");
      mrollno = s.nextInt();
      facultydc.inputdcmarks(mrollno);
      facultydc.inputdcAttendance(mrollno);
    }
    public void callmaths()
    {
      System.out.println("Enter rollno");
      mrollno = s.nextInt();
      facultymaths.inputmathsmarks(mrollno);
      facultymaths.inputmathsattendance(mrollno);
    }
    public void getjava()
    {
      System.out.println("Enter rollno");
      mrollno = s.nextInt();
      facultyjava.getjavamarks(mrollno);
    }
    public void getdsa()
    {
      System.out.println("Enter rollno");
      mrollno = s.nextInt();
      facultydsa.getdsamarks(mrollno);
    }public void getdc()
    {
      System.out.println("Enter rollno");
      mrollno = s.nextInt();
      facultydc.getdcmarks(mrollno);
    }public void getmaths()
    {
      System.out.println("Enter rollno");
      mrollno = s.nextInt();
      facultymaths.getmathsmarks(mrollno);
    }
}
