public class Program6
{ 
    public static void main(String[] args) 
    {
        // Write a program to print 2,4,6,8,10 using for loop
    	int n;
    	for(n=2; n<=10; n += 2) {
    	    System.out.println(n);
        }

        // using while loop
        n = 2;
        while(n <= 10) {
    	    System.out.println(n);
            n += 2;
        }
    }
}