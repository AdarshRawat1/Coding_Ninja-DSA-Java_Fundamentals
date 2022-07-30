import java.util.Scanner;
public class ArrayPair {
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
    public static void main (String [] Args){
        int arr[]= inputArray();
        int i =0;
        while (i<arr.length){
            int j=i+1;
            while (j<arr.length){
                System.out.print("("+arr[i]+","+arr[j]+")");
                j++;
            }
            i++;
        }

    }
}
