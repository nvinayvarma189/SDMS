import java.util.*;
import java.io.*;
class FacultyDc extends StudentDairy
	{
    Scanner s = new Scanner(System.in);
    int dcmark;
    int dcattendance;
    HashMap<Integer,Integer> studentsattendance  = new HashMap<Integer,Integer>();
    HashMap<Integer,Integer> studentsmarks1 = new HashMap<Integer,Integer>();
    HashMap<Integer,Integer> studentsmarks2 = new HashMap<Integer,Integer>();
    HashMap<Integer,Integer> studentsmarks3 = new HashMap<Integer,Integer>();
    public void inputdcmarks( int number) //faculty inputs marks for a student.
    {
      System.out.println("Enter dc periocdical 1 marks");
      dcmark = s.nextInt();
      studentsmarks1.put(number,dcmark);
      System.out.println("Enter dc periocdical 2 marks");
      dcmark = s.nextInt();
      studentsmarks2.put(number,dcmark);
      System.out.println("Enter java End semester marks");
      dcmark = s.nextInt();
      studentsmarks3.put(number,dcmark);
    }
    public void inputdcAttendance(int number) //faculty inputs attendance for a student.
    {
      System.out.println("Enter dc Attendance");
      dcattendance = s.nextInt();
      studentsattendance.put(number,dcattendance);
    }
    public void getdcmarks(int number) //to view the marks of a student.
    {
      System.out.println("Periodical 1 marks DC: "+ studentsmarks1.get(number));
      System.out.println("Periodical 1 marks DC: "+ studentsmarks2.get(number));
      System.out.println("End semester marks DC "+ studentsmarks3.get(number));
			try{
				if(studentsattendance.get(number) < 75) //to check whether he has minimum attendance to write the exam.
				{
					System.out.println("Your attendance is "+studentsattendance.get(number)+" and you are not qualified to write the exam");
				}
				else{
					System.out.println("DC attendance is "+studentsattendance.get(number));
				    }
			}catch(Exception e)
			{
				System.out.println("Not yet inputed");
			}

}
  }
