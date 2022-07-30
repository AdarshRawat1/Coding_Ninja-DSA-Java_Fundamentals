import java.util.Scanner;
public class BinarySearch {
    static int BSearch(int [] arr ,int element ){
        int start = 0,mid ;
        int end = arr.length-1;
        while (start <=end ){
            mid =(start +end )/2;
            if (arr[mid]>element){
                end = mid -1;
            }
            else if (arr[mid]<element){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    static int[] inputArray(){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println( "Enter the length of array");
            int n=sc.nextInt();
            int arr[] = new int[n];
            for(int i = 0 ; i<n;i++){
                System.out.println("Enter element at "+ i +"th index ");
                arr[i]=sc.nextInt();
            }
            return arr;
        }
    }
    public static void main (String [] args){
        Scanner sc = new Scanner ( System.in);
        int[] arr=inputArray();
        System.out.println( "Enter the element to search");
        int element=sc.nextInt();
        int index = BSearch(arr, element);
        if (index == -1){
            System.out.println( " Element not found");
        }
        else {
            System.out.println("Element at "+ index );
        }
        sc.close();
    }

}
