public class Program7
{ 
    public static void main(String[] args) 
    {
        // Write a program to print 10, 8, 6, 4, 2 using for loop and  while loop
    	int n;
    	for(n=10; n>=2; n -= 2) {
    	    System.out.println(n);
        }

        // using while loop
        n = 10;
        while(n >= 2) {
    	    System.out.println(n);
            n -= 2;
        }
    }
}