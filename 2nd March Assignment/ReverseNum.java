import java.util.*;
class ReverseNum 
{
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = sc.nextInt();
    
    System.out.println("Original Number: " + num);

    int reverseNum = 0;
    // run loop until num becomes 0
    while(num != 0) {
    
      // get last digit from num
      int digit = num % 10;
      reverseNum = reverseNum * 10 + digit;

      // remove the last digit from num
      num /= 10;
    }

    System.out.println("Reversed Number: " + reverseNum);
  }
}