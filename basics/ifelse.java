import java.util.Scanner;
public class ifelse
{
    public static void main ( String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check");
        int i = sc.nextInt();
        if (i%2==0)
        {
            System.out.println(i+"is even");
        }
        else 
        {
            System.out.println(i+"is odd");
        }
        sc.close();

    }
    
}
