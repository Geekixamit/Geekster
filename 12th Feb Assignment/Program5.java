// Calculate product of digits of a number

import java.util.Scanner;

public class Program5
{ 
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long num = in.nextLong();

        long product = 1;

        while(num != 0){
            int digit = (int)num%10;
            product *= digit;
            num = num/10;
        }

        System.out.println("The product of digits of a number = " + product);
    }
}