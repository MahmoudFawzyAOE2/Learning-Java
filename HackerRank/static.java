import java.util.*;

public class Main {
    static int B ;
    static int H ;
    static boolean flag = true ;

    static {
        Scanner in = new Scanner(System.in);
        B = in.nextInt();
        H = in.nextInt();
        in.close();
        try {
            if (B<=0 || H<=0){
                flag = false;
                throw new Exception("Breadth and height must be positive");
            }
        } catch(Exception e){
            System.out.print(e);
            System.exit(0);
        }
    }
    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }//end of main

}//end of class


