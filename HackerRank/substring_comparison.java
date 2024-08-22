import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);
        int n = s.length();
        for (int i=0; i<n-k+1; i++){
            String sub = s.substring(i, i+k);
            
            int result1 = sub.compareTo(smallest);
            if (result1 < 0) {smallest = sub;}
            
            int result2 = sub.compareTo(largest);
            if (result2 > 0) {largest = sub;}
            
        }
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}