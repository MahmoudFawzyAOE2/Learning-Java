import java.util.Scanner;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.compile;

public class Solution
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        for (int i=0; i<testCases; i++){
            String pattern = in.nextLine();
            try {
                Pattern result = compile(pattern);
                System.out.println("Valid");
            } catch (Exception e) {
                System.out.println("Invalid");
            }
        }
	}
}