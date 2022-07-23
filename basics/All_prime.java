import java.util.Scanner;
public class All_prime {
    public static void main ( String[] args){
        Scanner sc =new Scanner (System.in);
        int n=sc.nextInt();
        for (int i=2;i<=n;i++){
            boolean isprime=true;
            for (int j=2;j<i;j++){
                if(i%j==0){
                    isprime=false;
                    break;
                }
            }
            if (isprime){
                System.out.println(i);
            }
        }
    }
}
