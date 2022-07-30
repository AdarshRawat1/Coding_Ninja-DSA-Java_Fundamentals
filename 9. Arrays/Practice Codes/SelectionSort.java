import java.util.Scanner;
public class SelectionSort {
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
    static void sSort(int arr[]){
        int pos = 0;
        int minPos;
        while (pos <arr.length){
            int min = arr[pos];
            int Epos = arr[pos];
            minPos=pos;
            for ( int i=pos+1;i<arr.length;i++){
                if (arr[i]<min){
                    minPos=i;
                    min=arr[i];
                }
            } 
            arr[pos]=arr[minPos];
            arr[minPos]= Epos;
            pos++;
        }
    }
    public static void main ( String [] args){
        int arr[]= inputArray();
        sSort(arr);
        for(int i = 0 ; i<arr.length;i++){
            System.out.print(arr[i]+" < ");
        }
    }
}
