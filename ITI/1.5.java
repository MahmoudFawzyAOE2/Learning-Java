import java.util.*;
class Point {
    public int x;
    public int y;
    public Point() {x=0; y=0;};
    public Point(int tx, int ty) {x=tx; y=ty;}
    public void print () {System.out.printf("Point: [%d, %d]\n", x, y);}
}
public class Main {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        for (int i=0; i<2; i++){
            System.out.println("Enter X coordinate: ");
            int x = in.nextInt();

            System.out.println("Enter Y coordinate: ");
            int y = in.nextInt();

            Point p1 = new Point(x,y);

            p1.print();
        }

    }//end of main
}//end of class