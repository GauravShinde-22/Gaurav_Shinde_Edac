import java.util.Scanner;
class example5_3
{
  public static void main(String args[])
  {
   Scanner s=new Scanner(System.in);
   System.out.print("\n Enter the floating point number = ");
   float a=s.nextFloat();
   int count=0;
   do
   {
    a=a*10;
    count++;
   }
   while(a!=(int)a);
   System.out.println("Degits after decimal point "+count);
  }
}