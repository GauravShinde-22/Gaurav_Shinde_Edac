package Assinement6;
import java.util.Scanner;
class Student12
{
    int rollno;
    String name;
    public void setData(int rollNo,String name)
    {
        this.rollno=rollNo;
        this.name=name;
    }
    public void getData()
    {
        System.out.println("Roll Number  = "+rollno);
        System.out.println("Student Name = "+name);
    }        
}
class example1
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        Student12 x=new Student12();
        int a=s.nextInt();
        s.nextLine();
        String b=s.nextLine();
        x.setData(a, b);
        x.getData();
    }
}