
public class StringSample{
    static void printCharWise ( String str ){
        for (int i = 0 ; i<str.length();i++)
        System.out.println(str.charAt(i));
    }
    public static void main (String[] Args){
        String str= " adarsh rawat";
        printCharWise ( str);
        
    } 
}