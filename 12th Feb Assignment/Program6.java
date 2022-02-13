// WAP to print first x terms of the series 3N + 2 which are not multiples of 4.

import java.util.Scanner;

public class Program6
{ 
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the value of x: ");
        int x = in.nextInt();

        int count = 0, n = 1;

 
        while(true){
            int term = 3 * n + 2;
            if(term%4 != 0){
                System.out.print(term + " ");
                count++;
            }

            if(count == x){
                break;
            }

            n++;
        }
    }
}