// Write algorith to calculate power of a number

import java.util.Scanner;
public class Program2
{ 
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a base number: ");
        int base = in.nextInt();

        System.out.print("Enter a power number: ");
        int power = in.nextInt();

        long result = 1;

        for(int i=1; i<=power; i++){
            result *= base;
        }

        System.out.print(base + "^" + power + " = " + result);
    }
}