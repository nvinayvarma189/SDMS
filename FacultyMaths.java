import java.util.*;
import java.io.*;
class FacultyMaths extends StudentDairy
	{
    Scanner s = new Scanner(System.in);
    int mathsmark;
    int mathsattendance;
    HashMap<Integer,Integer> studentsattendance  = new HashMap<Integer,Integer>();
    HashMap<Integer,Integer> studentsmarks1 = new HashMap<Integer,Integer>();
    HashMap<Integer,Integer> studentsmarks2 = new HashMap<Integer,Integer>();
    HashMap<Integer,Integer> studentsmarks3 = new HashMap<Integer,Integer>();
    public void inputmathsmarks( int number) //Maths faculty inputs marks of a student.
    {
      System.out.println("Enter maths periocdical 1 marks");
      mathsmark = s.nextInt();
      studentsmarks1.put(number,mathsmark);
      System.out.println("Enter maths periocdical 2 marks");
      mathsmark = s.nextInt();
      studentsmarks2.put(number,mathsmark);
      System.out.println("Enter maths End semester marks");
      mathsmark = s.nextInt();
      studentsmarks3.put(number,mathsmark);
    }
    public void inputmathsattendance(int number) //Maths faculty inputs attendance of a student.
    {
      System.out.println("Enter maths Attendance");
      mathsattendance = s.nextInt();
      studentsattendance.put(number,mathsattendance);
    }
    public void getmathsmarks(int number) //To view the academic details of a student.
    {
      System.out.println("Periodical 1 marks maths: "+ studentsmarks1.get(number));
      System.out.println("Periodical 2 marks maths: "+ studentsmarks2.get(number));
      System.out.println("End semester marks maths: "+ studentsmarks3.get(number));
			try{
				if(studentsattendance.get(number) < 75) //checking attendance shortage.
				{
					System.out.println("Your attendance is "+studentsattendance.get(number)+" and you are not qualified to write the exam");
				}
				else{
					System.out.println("Maths attendance is "+studentsattendance.get(number));
				    }
			}catch (Exception e)
			{
				System.out.println("Not yet inputed");
			}
}
  }
