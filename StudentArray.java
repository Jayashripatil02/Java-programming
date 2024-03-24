import java.util.Scanner;
public class StudentArray
{
    public static class Student
    {
        public String name;
        public String dob;
        public int rollno;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of student");
        int n=sc.nextInt();
        Student[] studentArr = new Student[n];

        for(int i=0; i<n; i++)
        {
            System.out.println("*****"+(i+1)+"*****");
            Student s = new Student();
            System.out.print("Enter student Roll Number=");
            s.rollno=sc.nextInt();
            System.out.print("Enter student name=");
            s.name=sc.next();
            System.out.print("Enter student DOB=");
            s.dob=sc.next();

            studentArr[i]=s;
        }
         System.out.println("\n**********show all Students************");
         for(Student s:studentArr)
        {
            System.out.println("Roll Number ="+s.rollno);
            System.out.println("Roll Number ="+s.name);
            System.out.println("Roll Number ="+s.dob);
            System.out.print("");
        }
    }
}