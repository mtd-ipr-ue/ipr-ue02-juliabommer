import libraries.In;
import libraries.Out;

public class ue02_3 {
    public static void main(String[] args) {
        Out.println("Please enter the X-coordinate of your point:");
        double x = In.readDouble();
        Out.println("Please enter the Y-coordinate of your point:");
        double y = In.readDouble();
   
    if ( x>=0 && x<=4 && y>=0 && y<=4 && Math.sqrt (x*x + y*y) >= 4){
        Out.println("Your point is in the green field!");
    }
        else{
            Out.println("Your point is NOT in the green field!");
        }


}}
