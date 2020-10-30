import java.util.Scanner;
class example1_3
{
    public static void main(String args[])
    {
        /*System.out.print(new int[]{1,2,3,4,5}.length);
        System.out.println(new int[]{22,33,44,55}[1]);*/
        Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter 1st Array Number");
		int n=sc.nextInt();
		int arr[]= new int[n];
		
		System.out.println("Enter 2nd Array Number");
		int n1=sc.nextInt();
		int arr1[]= new int[n1];
		
		
		
		System.out.println("Enter 1st Array Element");
		for(int i=0;i<n;i++)
		{
			arr[i]= sc.nextInt();
		}
		
		System.out.println("Enter 2nd Array Element");
		for(int i=0;i<n1;i++)
		{
			arr1[i]= sc.nextInt();
		}
		
		
		int n3=n+n1;
		int arr3[]= new int[n3];
		
		
		int count=0,num=0;
		while(num <n3)
		{					
			if(count<n)   
			{
			arr3[num]=arr[count];
			num++;
			}
			
			if(count<n1)
			{
			arr3[num]=arr1[count];
			num++;
			}
			count++;
		}
		
		for(int i=0;i<n3;i++)
		{
			System.out.print(arr3[i]+" ");
		}

    }
}