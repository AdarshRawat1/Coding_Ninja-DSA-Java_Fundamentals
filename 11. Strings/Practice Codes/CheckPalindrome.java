import java.util.Scanner;
public class CheckPalindrome {
    static boolean check (String str){
       int left = 0 ;
       int right = str.length()-1;
       while (left <= right ){
        if (str.charAt(left)!=str.charAt(right)){
            return false;
        }
        left++;
        right--;
       }
       return true;
    }
    public static void main ( String [] args ){
        Scanner sc = new Scanner (System.in);
        String str = sc.next();
        if(check(str)){
            System.out.println("This String is palindrome");
        }
        else{
            System.out.println ("String is not palindrome");
        }
    }
    
}
