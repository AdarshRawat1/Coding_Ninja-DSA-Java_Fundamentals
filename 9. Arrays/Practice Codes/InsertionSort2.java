public class InsertionSort2 {
    static void iSort(int [] arr){
        for ( int i = 1 ;i < arr.length ; i++ ){
            int val = arr[i];
            for ( int j = i-1 ; j >0 ; j--){
                 if (arr[j]>val){
                    int temp =arr[j];
                    arr[j]=val;
                    arr[i]=temp;
                 }
            }
        }
    }
    public static void main ( String [] args){
        int [] arr= {99,32,423,234,234,243,1};
        iSort(arr);
        for ( int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+"<");
        }
    }
}
