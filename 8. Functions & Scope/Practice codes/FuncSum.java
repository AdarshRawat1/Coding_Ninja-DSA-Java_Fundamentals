import java.util.Scanner;
public class FuncSum {
        public static int sum (int a, int b ){
            int sum =a+b;
            return sum;
        }
        public static void main (String[] Args){
            Scanner sc = new Scanner (System.in);
            System.out.println("Enter two Numbers to add");
            int a = sc.nextInt();
            int b= sc.nextInt();
            int sum = sum (a,b);
            System.out.println("Sum= "+ sum );
            //System.out.println("Sum= "+ sum (a,b)); 
        }
}
