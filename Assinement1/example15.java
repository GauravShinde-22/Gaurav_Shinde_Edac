import java.util.Scanner;
class example15
{
 public static void main(String args[])
 {
  char a;
  int age;
  Scanner x=new Scanner(System.in);
  System.out.println("Enter your gender first letter and age ");
  a=x.next().charAt(0);
  age=x.nextInt();
  if(a=='M'|| a=='m' )
  {
   if(age>=21)
   {
     System.out.println("The person is Male and eligible to marriage");
   }
   else
   {
     System.out.println("The person is male and not eligible to marriage");
   }
  }
  else if(a=='F' || a=='f')
  {
   if(age>=18)
    {
     System.out.println("The person is Female and eligible to marriage");
    }
   else
    {
     System.out.println("The person is Female and not eligible to marriage");
    }
  }
 else
  {
  System.out.println("Wrong Entery");
  }
 }

}