import java.io.*;
class example1_2
{
  public static void main(String args[])
  {
    try
    {
     DataInputStream x=new DataInputStream(System.in);
     int a, c;
     System.out.println("Input The Number");
     a=Integer.parseInt(x.readLine());
     System.out.println("Multiplication table of " + a);

     for (c = 1; c <= 10; c++)
       System.out.println(a + " * " + c + " = " + (a*c));
     }
     catch(Exception e){}
   }
}