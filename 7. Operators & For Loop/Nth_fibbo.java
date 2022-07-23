import java.util.Scanner;
public class Nth_fibbo{
    public static void main(String[] Args){
        Scanner sc =new Scanner (System.in);
        int n =sc.nextInt();
        int a=0;
        int b=1;
        int c=0;
        for (int i =1;i<=n;i++){
            c=a+b;
            a=b;
            b=c;
        }
        System.out.println(a);
        sc.close();
    }
}

/* Improved code --

import java.util.Scanner;
public class Nth_fibbo{
    public static void main (String[] Args){
        Scanner sc =new Scanner ( System.in);
        System.out.println("Enter the value of N ");
        int n =sc.nextInt();
        int c=1,n1=1,n2=1;
        int t=0;
        if (n==1){
            System.out.println(n+"st term is 1"+n1);
        }
        else if (n==2){
            System.out.println(n+"nd term is "+n2);
        }
        else if (n>=3){
            c=2;
            while (c!=n){
                t = n1+n2;
                n1=n2;
                n2=t;
                c++;
            }
            System.out.println(n+"th term is "+ t);
        }
        else {
            System.out.println("Enter a valid value for n");
        }
        sc.close();
    }
}
*/