import java.util.Scanner;
//Calculating NcR  i.e. (n!)/(r!*(n-r)!)
public class NcR{
    // funtion for returning factorial of num 
    public static int fact(int num){
        int fact =1;
        for (int i=1;i <=num;i++){
            fact=fact*i;
        }
        return fact;
    }
    public static void main (String[] args){
    Scanner sc =new Scanner ( System.in );
    int n= sc.nextInt();
    int r = sc.nextInt();
    int factN=fact(n);
    int factR=fact(r);
    int factNR=fact(n-r);
    int NcR= factN /(factR*factNR);
    System.out.println("The NcR will be"+NcR);
}
}