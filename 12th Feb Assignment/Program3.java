// Java Program To Calculate Distance Between Two Points

import java.lang.Math;

public class Program3
{ 
    public static void main(String[] args) 
    {
        int x1=1, y1=1, x2=4, y2=4;
        double distance;
        
        distance = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));

        System.out.println("Distance between point" + "(" + x1 + "," + y1 + ") and point" + "(" + x2 + "," + y2 + ") is " + distance);
    }
}