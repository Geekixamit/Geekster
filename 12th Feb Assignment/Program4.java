// WAP to print Sum of even and odd numbers considering 10 numbers are taken from user

import java.util.Scanner;

public class Program4
{ 
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);

        int oddSum = 0, evenSum = 0;

        for(int i=1; i<=10; i++){
        	System.out.print("Enter number " + i + ": ");
        	int num = in.nextInt();

        	if(num%2 == 0){
        		evenSum += num;
        	} else {
        		oddSum += num;
        	}
        }

        System.out.println("\nSum of even numbers = " + evenSum);
        System.out.println("Sum of odd numbers = " + oddSum);
    }
}