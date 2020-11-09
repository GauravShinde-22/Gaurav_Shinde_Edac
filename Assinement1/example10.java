import java.util.Scanner;
class example10 
{
    public static void main(String[] args) 
    {
        double celsius, fahrenheit;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit:");
        fahrenheit = s.nextDouble();
        celsius = 5*(fahrenheit-32)/9 ;
        System.out.println("Temperature in Celsius:"+celsius);        
    }
}