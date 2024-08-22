import java.util.*;
public class Main {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("Enter side length: ");
        int n = in.nextInt();
        for (int i=0; i<=n; i++){ // row (line)
            for (int j=0; j<i; j++){ // column
                System.out.print("*");
            }
            System.out.println();
        }

    }//end of main
}//end of class