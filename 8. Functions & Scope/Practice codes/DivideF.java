import java.util.Scanner;
public class DivideF {
    public static float Div(int a,int b){
        if ( b==0){
            return Integer.MIN_VALUE;
        }
        return ((float)a)/b;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the value");
        int a= sc.nextInt();
        int b= sc.nextInt();
        float result= Div(a,b);
        System.out.println(a+"/"+b+"="+result);
        sc.close();
    }
}
