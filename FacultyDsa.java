import java.util.*;
import java.io.*;
class FacultyDsa extends StudentDairy
	{
    Scanner s = new Scanner(System.in);
    int dsamark;
    int dsaattendance;
    HashMap<Integer,Integer> studentsattendance  = new HashMap<Integer,Integer>();
    HashMap<Integer,Integer> studentsmarks1 = new HashMap<Integer,Integer>();
    HashMap<Integer,Integer> studentsmarks2 = new HashMap<Integer,Integer>();
    HashMap<Integer,Integer> studentsmarks3 = new HashMap<Integer,Integer>();
    public void inputdsamarks( int number) //DS faculty input marks for a student.
    {
      System.out.println("Enter dsa periocdical 1 marks");
      dsamark = s.nextInt();
      studentsmarks1.put(number,dsamark);
      System.out.println("Enter dsa periocdical 2 marks");
      dsamark = s.nextInt();
      studentsmarks2.put(number,dsamark);
      System.out.println("Enter dsa End semester marks");
      dsamark = s.nextInt();
      studentsmarks3.put(number,dsamark);
    }
    public void inputdsaAttendance(int number) //DS faculty input attendance for a student.
    {
      System.out.println("Enter dsa Attendance");
      dsaattendance = s.nextInt();
      studentsattendance.put(number,dsaattendance);
    }
    public void getdsamarks(int number) //To view the academic details of a student.
    {
      System.out.println("Periodical 1 marks Dsa: "+ studentsmarks1.get(number));
      System.out.println("Periodical 2 marks Dsa: "+ studentsmarks2.get(number));
      System.out.println("End semester marks Dsa: "+ studentsmarks3.get(number));
			try
			{
				if(studentsattendance.get(number) < 75) //checking attendance shortage.
				{
					System.out.println("Your attendance is "+studentsattendance.get(number)+" and you are not qualified to write the exam");
				}
				else{
					System.out.println("Dsa attendance is "+studentsattendance.get(number));
	    }
			}catch (Exception e)
			{
				System.out.println("Not yet inputed");
			}

  }
}
