import java.util.*;

public class Main {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int s;

        while (true) {
            System.out.println("Input an integer between 0 and 1000: ");
            s = in.nextInt();

            if (s >1000 || s<0){
                System.out.println("integer must be between 0 and 1000, try again");
            }
            else {
                break;
            }
        }

        int d1 = s % 10 ;
        int d2 = s % 100 / 10 ;
        int d3 = s % 1000  / 100;
        int d4 = s / 1000  ;

        System.out.printf("The sum of all digits in %d is %d", s, d1+d2+d3+d4);

    }//end of main

}//end of class