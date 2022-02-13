// Write a algorith to print multiplication table of a number entered by user

import java.util.Scanner;

public class Program2
{ 
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = in.nextInt();

        for(int i=1; i<=10; i++)
        {
            int mult = n*i;
            System.out.println(n + " * " + i + " = " + mult);
        } 
    }
}