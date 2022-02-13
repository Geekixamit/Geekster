// Write program to print all odd numbers backward from 99 to 1 

public class Program2
{ 
    public static void main(String[] args) 
    {
        for(int n=99; n>=1; n--){
            if(n%2 == 1){
                System.out.println(n);
            }
        }
    }
}