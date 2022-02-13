// 1. Check if a year is leap year or not
import java.util.Scanner;

public class Program1
{ 
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = in.nextInt();

        // A year is leap year if:
        // case 1: it is divisible by 4 but not by 100
        // Or case 2: it is divisible by 400  
        if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0)) {
            System.out.println(year + " is a leap year.");
        }
        else
        {
            System.out.println(year + " is not a leap year!");
        }
    }
}