import java.util.Scanner;
public class NoOfWords {
    static int noOfWords( String Str){
        
        if (Str.length()==0){
                return 0;
        }
        int spaces= 0 ;
        for ( int i = 0 ; i < Str.length();i++){
            if ( Str.charAt(i)==' '){
                    spaces++;
            }
        }
        return spaces+1;
    }
    public static void main( String[] Args){
        Scanner sc = new Scanner ( System.in );
        String str = sc.nextLine();
        int c = noOfWords(str);
        System.out.println(c);
        sc.close();
    }
}
