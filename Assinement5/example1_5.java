import java.util.Scanner;
class example1_5
{
  public static void main(String args[])
  {
   Scanner x=new Scanner(System.in);
   int counta=0,countb=0,countc=0,counts=0; 
   System.out.println("Enter String To Check");
   String str1=x.nextLine();
   String specialChar="!@#$%^&*()_+-,.<>?/':;[]~`|{}";
   str1=str1.toLowerCase();
   for(int i=0;i<str1.length();i++)
   {
     char a=str1.charAt(i);
    if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u')
    {
     counta++;
    }
    else if(a>='a'&&a<='z')
    {
     countb++;
    }
    else if(a>='0'&&a<='9')
    {
     countc++;
    }
    else if(specialChar.contains(Character.toString(a)))
    {
      counts++;
    }
   }
   System.out.println(counta);
   System.out.println(countb);
   System.out.println(countc);
   System.out.println(counts);  
  }
}