// Use for loop to calculate sum of numbers till n, where n is taken from user

import java.util.Scanner;

public class Program1
{ 
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = in.nextInt();

        long sum = 0;

        for(int i=1; i<=n; i++)
        {
            sum += i;
        }

        System.out.print("Sum of numbers from 1 to " + n + " = " + sum);
    }
}