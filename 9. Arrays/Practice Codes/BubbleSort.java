public class BubbleSort {
    static void bSort(int[] arr){
        for ( int i =1 ; i < arr.length;i++){
                for ( int j = 0 ; j < (arr.length - i );j++ ){
                    if (arr[j]>arr[j+1]){
                        int temp = arr[j];
                        arr[j]= arr[j+1];
                        arr[j+1]= temp;
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
        bSort(arr);
        for (int i =0 ; i< arr.length;i++){
            System.out.print(arr[i]+"<");
        }
    }
}
