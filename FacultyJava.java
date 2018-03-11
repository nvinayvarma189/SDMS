import java.util.*;
import java.io.*;
class FacultyJava extends StudentDairy
	{
    Scanner s = new Scanner(System.in);
    int javamark;
    int javaattendance;
    HashMap<Integer,Integer> studentsattendance  = new HashMap<Integer,Integer>();
    HashMap<Integer,Integer> studentsmarks1 = new HashMap<Integer,Integer>();
    HashMap<Integer,Integer> studentsmarks2 = new HashMap<Integer,Integer>();
    HashMap<Integer,Integer> studentsmarks3 = new HashMap<Integer,Integer>();
    public void inputjavamarks( int number) //Java faculty input marks of a student.
    {
      System.out.println("Enter java periocdical 1 marks");
      javamark = s.nextInt();
      studentsmarks1.put(number,javamark);
      System.out.println("Enter java periocdical 2 marks");
      javamark = s.nextInt();
      studentsmarks2.put(number,javamark);
      System.out.println("Enter java End semester marks");
      javamark = s.nextInt();
      studentsmarks3.put(number,javamark);
    }
    public void inputjavaAttendance(int number) //Java faculty input attendance for a student.
    {
      System.out.println("Enter java Attendance");
      javaattendance = s.nextInt();
      studentsattendance.put(number,javaattendance);
    }
    public void getjavamarks(int number) //To view the academic details of the student
    {
      System.out.println("Periodical 1 marks java: "+ studentsmarks1.get(number));
      System.out.println("Periodical 2 marks java: "+ studentsmarks2.get(number));
      System.out.println("End sem marks java: "+ studentsmarks3.get(number));
			try
			{
				if(studentsattendance.get(number) < 75) //checking for attendance shortage.
				{
					System.out.println("Your attendance is "+studentsattendance.get(number)+" and you are not qualified to write the exam");
				}
				else
					System.out.println(studentsattendance.get(number));
				}catch (Exception e)
				{
					System.out.println("Not yet entered");
				}

  }
}
