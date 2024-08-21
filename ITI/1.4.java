import java.util.*;

public class Main {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number: ");
        float number = in.nextFloat();

        double square = (double) number* number;
        double cube = (double) number* square;
        double fourth_power = (double) number* cube;

        System.out.printf("square: %.2f\n", square);
        System.out.printf("cube: %.2f\n", cube);
        System.out.printf("fourth_power: %.2f\n", fourth_power);

    }//end of main

}//end of class