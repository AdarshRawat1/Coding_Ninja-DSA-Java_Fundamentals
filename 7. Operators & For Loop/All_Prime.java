import java.util.Scanner;
public class All_Prime {
    public static void main (String[] args){
        Scanner sc =new Scanner ( System.in);
        int n =sc.nextInt();
        for (int i =2;i<=n;i++){
                int j=i;
                int c=0;
                while (j>0){
                    if (i%j==0){
                        c++;
                    }
                    j--;
                }
                if (c==2){
                    System.out.println(i);
                }
        }

    }
}
