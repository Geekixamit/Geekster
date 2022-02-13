public class Program2
{ 
    public static void main(String[] args) 
    {
        // Write an Algorithm that checks two numbers and print minimum of Two numbers
        int num1 = 25, num2 = 11;

        if(num1 < num2){
            System.out.println("Minimum number is " + num1);
        } else if(num1 > num2) {
            System.out.println("Minimum number is " + num2);
        } else {
            System.out.println("Both numbers are same!");
        }
    }
}
