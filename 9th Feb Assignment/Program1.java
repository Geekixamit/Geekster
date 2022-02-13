public class Program1 
{ 
    public static void main(String[] args) 
    {
        // "Write algorithm that checks two numbers and print maximum of Two numbers
        int num1 = 10, num2 = 20;

        if(num1 > num2){
            System.out.println("Maximum number is " + num1);
        } else if(num1 < num2) {
            System.out.println("Maximum number is " + num2);
        } else {
            System.out.println("Both numbers are same!");
        }
    }
}
