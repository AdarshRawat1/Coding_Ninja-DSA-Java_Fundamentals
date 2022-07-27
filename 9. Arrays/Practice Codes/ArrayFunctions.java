import java.util.Scanner;
public class ArrayFunctions {
    static int[] inputArray(){
        Scanner sc=new Scanner(System.in);
        System.out.println( "Enter the lenght of array");
        int n=sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i<n;i++){
            System.out.println("Enter element at "+ i +"th index ");
            arr[i]=sc.nextInt();
        }
        sc.close();
        return arr;
    }
    static void printArray(int arr[]){
        for (int i = 0 ; i<arr.length;i++){
            System.out.println ( arr[i]);
        }
    }
    public static void main (String [] args){
        int arr[]=inputArray();
        printArray(arr);
    }
}
