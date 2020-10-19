import java.util.Scanner;
class example5_2
{
  public static void main(String args[])
  {
    Scanner x=new Scanner(System.in);
    int start,end,count=0,i,j;
    System.out.print("\n Enter the Starting Number = ");
    start=x.nextInt();
    System.out.print("\n Enter the Ending Number = ");
    end=x.nextInt();
    System.out.println("The Prime Number "+start+"to"+end);
    for(i=start ; i<=end ; i++) //loop for finding and printing all prime numbers between given range
    {
      count=0;
      for(j=1 ; j<=i ; j++) //checking number is prime or not
       {
        if(i%j==0)
        {
         count=count+1;
        }
       }
       if(count==2)
       {
         System.out.print(i+" ");
       }
    
   }
  }
}