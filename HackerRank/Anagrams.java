import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        
        String letter = "";
        for (int i =0; i<a.length(); i++){
            letter = a.substring(i, i+1);
            for (int j =0; j<b.length(); j++){
                if (letter.compareTo(b.substring(j, j+1)) == 0){
                    a = a.replaceFirst(letter, " ");
                    b = b.replaceFirst(letter, " ");
                    break;
                }
            }   
        }
        a = a.replaceAll(" ", "");
        b = b.replaceAll(" ", "");
        if (a.length()==0 && b.length()==0){return true;} else {return false;}
    }


    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}