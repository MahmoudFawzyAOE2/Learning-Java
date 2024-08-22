import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        
        String flag = "Yes";
        int n = A.length();
        for (int i=0; i<n/2; i++ ){
            int result1 = A.substring(i, i+1).compareTo(A.substring(n-i-1, n-i));
            if (result1 != 0) {
                flag = "No";
                break;
            }
        }
        System.out.println(flag);
        /* Enter your code here. Print output to STDOUT. */
        
    }
}

