import java.util.Scanner;
class Book
{
 int id;
 float price;
 String name;
 public void get()
 {
  Scanner x=new Scanner(System.in);
  System.out.println("Enter Book Id ");
  id=x.nextInt();
  x.nextLine();
  System.out.println("Enter Book Name ");
  name=x.nextLine();
  System.out.println("Enter Book Price ");
  price=x.nextFloat();
 }
 public void put()
 {
     System.out.println("Book Id "+id);
     System.out.println("Book Name "+name);
     System.out.println("Book Price "+price);
 } 
}
class example2_4
{
 public static void main(String args[])
 {
  Scanner s=new Scanner(System.in);
  int n=s.nextInt();
  int i;
  Book bk[]=new Book[n];
  for(i=0;i<n;i++)
  {
   bk[i]=new Book();
   bk[i].get();
  } 
  for(i=0;i<n;i++)
   bk[i].put();
 }
}