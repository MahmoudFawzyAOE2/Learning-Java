import java.util.*;

public class Main {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("Input the number of minutes:");
        int minutes = in.nextInt();

        int hours = minutes /60 ;
        int all_days = hours / 24 ;
        int years = all_days / 365 ;
        int remainder_days = all_days % 365  ;

        System.out.printf("%d minutes is approximately %d years and %d days", minutes, years, remainder_days);

    }//end of main

}//end of class