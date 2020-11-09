import java.util.Scanner;
class example13_2
 {

    public static void main(String[] args) 
    {
      Scanner x=new Scanner(System.in);
        double n1,n2,n3;
      System.out.println("Enter the three number");
        n1=x.nextDouble(); 
        n2=x.nextDouble();
        n3=x.nextDouble();
        if(n1 >= n2) 
         {
            if(n1 >= n3)
             {
                System.out.println(n1 + " is the largest number.");
             }
             else
              {
                System.out.println(n3 + " is the largest number.");
              } 
       }
        else
        {
         if(n2 >= n3)
          {
                System.out.println(n2 + " is the largest number.");
          }
        else
          {
           System.out.println(n3 + " is the largest number.");
          }
        }
    }
}