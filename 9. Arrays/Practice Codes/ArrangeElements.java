import java.util.Scanner;
public class ArrangeElements{
    static void printArray(int arr[]){
        for (int i = 0 ; i<arr.length;i++){
            System.out.println ( arr[i]);
        }
    }
    public static void main(String[] Args){
        Scanner sc = new Scanner ( System.in );
        System.out.println("Enter the length of array" );
        int n=sc.nextInt();
        int i=0,num=1,j=n-1;
        int arr[] = new int[n];
        while (i <j){
            arr[i]=num;
            num++;
            i++;
            arr[j]=num;
            num++;
            j--;
        }
         if(i==j){
             arr[i]=num; 
      }
        printArray(arr);
        sc.close();
    }
}