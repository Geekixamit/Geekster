// Write algorithm to find Compound Interest, provided priciple, time and ROI are taken by user"

import java.util.Scanner;

class Program7 
{
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        double principal = in.nextDouble();

        System.out.print("Enter the rate of interest: ");
        double rate = in.nextDouble();

        System.out.print("Enter the time frame: ");
        double time = in.nextDouble();

        System.out.print("Enter number of times interest is compounded: ");
        int number = in.nextInt();

        double interest = principal * (Math.pow((1 + rate/100), (time * number))) - principal;

        System.out.println("Principal = " + principal);
        System.out.println("Interest Rate = " + rate);
        System.out.println("Time Duration = " + time);
        System.out.println("Number of times interest Compounded = " + number);
        System.out.println("Compound Interest = " + interest);
        System.out.println("Total Amount = " + (principal + interest));

    }
}