import java.util.Scanner;
public class LargestElement {
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

    public static void main(String[] Args ){
        int max = Integer.MIN_VALUE;
        int arr[]=inputArray();
        for(int i = 0 ; i<arr.length;i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }
    System.out.println("The Value of largest element = "+ max);
    }
    
}
