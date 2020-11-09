import java.util.Scanner;
class example9
{
 public static void main(String args[])
 {
  Scanner x=new Scanner(System.in); 
  int m,y,w,d;
  System.out.print("\n Enter Number Of Days");
  m = x.nextInt();
  y = m / 365;
  m = m % 365;
  System.out.println("No. of years:"+y);
  w = m / 7;
  m = m % 7;
  System.out.println("No. of weeks:"+w);
  d = m;
  System.out.println("No. of days:"+d);
 }
}