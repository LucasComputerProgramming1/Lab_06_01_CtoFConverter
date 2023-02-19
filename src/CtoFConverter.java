import java.util.Scanner;
public class CtoFConverter {
    public static void main(String[] args) {
        //Declaring Variables
        double input = 0;
        double converted = 0;
        Scanner in = new Scanner(System.in);
        //Prompt For Input
        System.out.println("This is a degrees celsius to fahrenheit converter. Please enter your temperature in degrees celsius: ");
        //Input Celsius
        System.out.print("");
        if (in.hasNextDouble()) {
            input = in.nextDouble();
            converted = input * 1.8 + 32;
            //Output Converted
            System.out.println("Your temperature in fahrenheit is " + converted);
        }
        else {
            System.out.println("You entered an invalid input, please restart and try again.");
        }
    }
}