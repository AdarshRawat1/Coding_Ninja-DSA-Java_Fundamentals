import java.util.Scanner;
public class SelectionSort {
    // function for Array input
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
    //Function for Selection Sort
    static void sSort(int arr[]){
        for ( int pos = 0 ; pos < arr.length ; pos ++){
            int minPos =pos;
            for ( int j = pos + 1; j <arr.length ; j++){
                if (arr[j]<arr[minPos]){
                    minPos = j;   
                }
            }
            if (minPos != pos){
                int temp = arr [pos];
                arr[pos]= arr [minPos];
                arr [minPos]= temp;
            } 
        }
    }
    //main function 
    public static void main ( String [] args){
        int arr[]= inputArray();
        sSort(arr);
        for(int i = 0 ; i<arr.length;i++){
            System.out.print(arr[i]+" < ");
        }
    }
}
