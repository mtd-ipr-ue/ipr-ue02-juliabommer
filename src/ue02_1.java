import libraries.Out;
import libraries.In;

public class ue02_1 {
    public static void main(String[] args) {
        Out.println("Please enter your first number:");
        int firstnum = In.readInt();

        Out.println("Please enter your second number:");
        int secondnum = In.readInt();

        Out.println("Please enter your third number:");
        int thirdnum = In.readInt();

        int maxnum; 

        if (firstnum > secondnum && firstnum > thirdnum){
            maxnum = firstnum; 
        }
        else if (secondnum > firstnum && secondnum > thirdnum){
            maxnum = secondnum; 
        }
        else {
            maxnum = thirdnum; 
        }

        Out.println("This is the maximum:");
        Out.println(maxnum);
    }
}