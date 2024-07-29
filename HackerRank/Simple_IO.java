import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.print("Hello world!");

        System.out.println(500);
        System.out.println();

        Scanner in = new Scanner(System.in);

        String s = in.nextLine();
        System.out.println(s+5);

        int a = in.nextInt();
        System.out.println(a+5);

    }
}