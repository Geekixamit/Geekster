//  Write a algorith that checks if a number is a Prime number. take the user input.

import java.util.Scanner;
public class Program1
{ 
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = in.nextInt();

        if(num == 2){
            System.out.print(num + " is a prime number!");
        } else {
            int flag = 0;
            for(int i=2; i<num; i++){
                if(num%i == 0){
                    flag = 1;
                }
            }

            if(flag == 0){
                System.out.print(num + " is a prime number!");
            } else {
                System.out.print(num + " is not a prime number!");
            }
        }
    }
}