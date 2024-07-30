import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int temp = b;
            int pow = 1;
            for (int x =0; x<n;++x){  // x: index for the term in the series (0 -> n-1)
                System.out.printf("%d ",a + temp );
                pow = 2 * pow;       // to calculate 2^i without suing a separate loop
                temp = temp + pow*b; // add 2^i * b to the term
            }
            System.out.printf("%n");
        }
        in.close();
    }
}