//Code to print even number from range N to M using Functions without parameters

import java.util.Scanner;
public class N_Even {
    static Scanner sc =new Scanner(System.in);
    public static void Eprint(){
        System.out.println("Enter Lower and upper limit");
        int n = sc.nextInt();
        int m =sc.nextInt();
        while (n <=m){
            if (n%2==0){
                System.out.println(n);
            }
            n++;
        }
    }
    public static void main (String[] Args){
        //calling the function 
        Eprint();
    }
    
    
}
