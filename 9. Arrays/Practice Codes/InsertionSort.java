import java.util.Scanner;
public class InsertionSort {
    static void iSort(int [] arr){
        for( int i =0 ; i < arr.length-1 ; i ++){
            for(int j=i;j>=0;j--){
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            }
            }
    static int[] inputArray(){
        Scanner sc=new Scanner(System.in);
        System.out.println( "Enter the length of array");
        int n=sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i<n;i++){
            System.out.println("Enter element at "+ i +"th index ");
            arr[i]=sc.nextInt();
        }
        sc.close();
        return arr;
    }
    public static void main ( String [] args ){
        int[] arr= inputArray();
        iSort(arr);
        for (int i =0 ; i< arr.length;i++){
            System.out.print(arr[i]+"<");
        }
    }
}
