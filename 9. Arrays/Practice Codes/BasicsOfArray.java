import java.util.Scanner;
public class BasicsOfArray{
    public static void main ( String [] Args){
        Scanner sc = new Scanner(System.in);
        System.out.println( "Enter the Length of array");
        int n = sc.nextInt();
        int arr[] =new int [n];
        System.out.println("Enter the values of array");
        for( int i = 0 ; i<n;i++)// i<arr.length
        {
            System.out.print("Enter the element at "+i+"th index - ");
            arr[i]=sc.nextInt();
        }
        for( int i = 0 ; i<n;i++)
        {
            System.out.print("Element at "+i+"th index - ");
            System.out.println(arr[i]);
        }

        sc.close();

    }
}