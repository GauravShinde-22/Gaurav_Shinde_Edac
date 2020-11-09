import java.util.Scanner;
class Student
{
  int rollno;
  String name;
  public void get()
  {
   Scanner x=new Scanner(System.in);
   System.out.println("Enter Student Roll Number");
   rollno=x.nextInt();
   x.nextLine();
   System.out.println("Enter Student Name");
   name=x.nextLine();
  }
  public void print()
  {
   System.out.println("\nRoll Number = "+rollno);
   System.out.println("Name = "+name);
  }
}
class example1_4
{
  public static void main(String args[])
  {
   Scanner s=new Scanner(System.in);
   System.out.print("\n Enter the number of student =");
   int n=s.nextInt();
   int i;
   Student st[]=new Student[n];
   for(i=0;i<n;i++)
   {
    st[i]=new Student();
    st[i].get();
   }
   for(i=0;i<n;i++)
    st[i].print();
  }
}