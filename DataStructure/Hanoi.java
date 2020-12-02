package DataStructure;
import java.util.Scanner;
//corona bed are avalable for 
class Hanoi
{
    static void tower(int n,char form,char to,char aux)
    {
        if(n==1)
        {
             System.out.println("Move disk 1 from rod " +  form + " to rod " + to); 
            return; 
        } 
        tower(n-1, form,aux,to); 
        System.out.println("Move disk " + n + " from rod " +  form + " to rod " + to); 
        tower(n-1, aux, to, form);
    }
    
    public static void main(String args[])
    {
        Scanner x=new Scanner(System.in);
       int n;
       System.out.println("Enter number if disk = ");
       n=x.nextInt();
       tower(n,'A','B','C');
       double result= (double)(Math.pow(2, n));
        double re=result-1; 
       System.out.println("Number of move ="+re);
    }
    
}