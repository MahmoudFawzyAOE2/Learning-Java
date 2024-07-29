import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        // here we want to take 3 inputs from the user: int, double and string
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine(); /* this line is used to absorb the newline character caused by the previous scanner
                            so the next scanner will take the string input with no problems */
        String s = scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}