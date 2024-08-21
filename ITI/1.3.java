import java.util.*;

public class Main {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("Input weight in pounds: ");
        int weight = in.nextInt();

        System.out.println("Input height in inches: ");
        int height = in.nextInt();

        double weight_kg = (double) weight* 0.45359237000000013;
        double height_m = (double) height* 0.0254;

        double BMI_metric = weight_kg / (height_m * height_m);
        System.out.printf("Body Mass Index (metric)is %2.14f\n", BMI_metric);

    }//end of main

}//end of class