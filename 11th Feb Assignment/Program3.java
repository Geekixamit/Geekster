// Write a algorith to swap 2 numbers, where numbers are taken from user

import java.util.Scanner;

public class Program3
{ 
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a first number: ");
        int n1 = in.nextInt();

        System.out.print("Enter a second number: ");
        int n2 = in.nextInt();

        System.out.print("\nBefore Swapping: n1 = " + n1 + ", n2 = " + n2);

        int temp = n1;
        n1 = n2;
        n2 = temp;

        System.out.print("\nAfter Swapping: n1 = " + n1 + ", n2 = " + n2);
    }
}