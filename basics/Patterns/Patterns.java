


// ENter the value of n 
// 5
//   *
//  ***
// *****
//  ***
//   *

// import java.util.Scanner ;
// public class Patterns{
//     public static void main(String[] Args){
//         Scanner sc =new Scanner (System.in);
//         System.out.println("ENter the value of n ");
//         int n=sc.nextInt();
//         int i=1;
//         int k=(n/2)+1;
//         int j =1;
//         while(i<=k){
//             j =1;
//             while (j<(k-i+1)){
//                 System.out.print(" ");
//                 j++;
//             }
//             j=1;
//             while(j<=i){
//                 System.out.print("*");
//                 j++;
//             }
//             j=1;
//             while(j<i){
//                 System.out.print("*");
//                 j++;
//             }
//             i++;
//             System.out.println();
//         }
//         i=1;
//         k=(n/2);
//         while (i<=n)
//         {   j=1;
//             while (j<=i){
//                 System.out.print(" ");
//                 j++;
//             }
//             j=1;
//             while(j<=(k-i+1)){
//                 System.out.print("*");
//                 j++;
//             }
//             j=1;
//             while (j<k-i+1){
//                 System.out.print("*");
//                 j++;
//             }
//             i++;
//             System.out.println();

//         }
//         sc.close();

//     }
// }


// Enter the value of n 
// 5
//         1
//       232
//     34543
//   4567654
// 567898765

// import java.util.Scanner;

// public class Patterns {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the value of n ");
//         int n = sc.nextInt();
//         int i = 1;
//         while (i<=5){ 
//             int j =1;
//             int p=i;
//             while (j<=(n-i)){
//                 System.out.print("  ");
//                 j++;
//             }
//             j=1;
//             while (j<=i){
//                 System.out.print(p);
//                 p++;
//                 j++;
//             }
//             p=p-1;
//             j=1;
//             while (j<i){
//                 p--;
//                 System.out.print(p);
//                 j++;
//             }
//             i++;
//             System.out.println();
//         }
//         sc.close();
//     }
// }
        


// Enter the value of n
// 4
// *
// **
// ***
// ****
// import java.util.Scanner ;
// public class Patterns{
// public static void main (String[] Args){
// Scanner sc=new Scanner (System.in);
// System.out.println("Enter the value of n");
// int n =sc.nextInt();
// int i=1;
// while(i<=n){
// int j=1;
// while (j<=(n-i)){
// System.out.print(" ");
// j++;
// }
// int k=1;
// while(k<=i){
// System.out.print("*");
// k++;
// }
// i++;
// System.out.println();
// }
// sc.close();

// }
// }

// Enter tha value of n
// 5
// E
// DE
// CDE
// BCDE
// ABCDE

// import java.util.Scanner;
// public class Patterns{
// public static void main(String[] args){
// Scanner sc=new Scanner(System.in);
// System.out.println("Enter tha value of n");
// int n = sc.nextInt();
// int i=1;
// while (i<=n){
// int j=1;
// char p=(char)('A'+n-1);
// while(j<=i){
// System.out.print((char)(p-i+j));
// j++;
// }
// System.out.println(" ");
// i++;
// }
// sc.close();

// }
// }

// Enter the value of n
// 6
// A
// BC
// CDE
// DEFG
// EFGHI
// FGHIJK
// import java.util.Scanner;
// public class Patterns{
// public static void main ( String [] args){
// Scanner sc =new Scanner(System.in);
// System.out.println("Enter the value of n ");
// int n = sc.nextInt();
// int i =1;

// while (i<=n){
// char p=(char)('A'+i-1);
// int j=0;
// while (j<i){
// System.out.print((char)(p));
// p++;
// j++;
// }
// System.out.println(" ");
// i++;
// }
// sc.close();

// }
// }

/**
 * Enter the value of n
 * 5
 * 1
 * 2 1
 * 3 2 1
 * 4 3 2 1
 * 5 4 3 2 1
 * import java.util.Scanner;
 * public class Patterns{
 * public static void main (String [] Args){
 * Scanner sc = new Scanner ( System.in);
 * System.out.println("Enter the value of n");
 * int n = sc.nextInt();
 * int i =1;
 * if (n>=0 && n<=50){
 * while (i<=n){
 * int j =0;
 * while (j<i){
 * System.out.print(i-j+" ");
 * j++;
 * }
 * i++;
 * System.out.println("");
 * }
 * }
 * else{
 * System.out.println("value of n Out of bound");
 * }
 * sc.close();
 * 
 * }
 * }
 * 
 * 
 * 
 * 
 * 
 * /**
 * 
 * Enter the value of n
 * 4
 *
 * *
 * * *
 * * * *
 * import java.util.Scanner;
 * public class Patterns {
 * public static void main ( String[] Args){
 * System.out.println("Enter the value of n");
 * Scanner sc = new Scanner (System.in);
 * int n = sc.nextInt();
 * int i=1;
 * while (i<=n){
 * int j =1;
 * while (j<=i){
 * System.out.print("*"+" ");
 * j++;
 * }
 * System.out.println(" ");
 * i+=1;
 * }
 * sc.close();
 * }
 * }
 */
/**
 * Enter the value of n
 * 4
 * 1
 * 2 3
 * 3 4 5
 * 4 5 6 7
 * 
 * import java.util.Scanner;
 * public class Patterns {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * System.out.println("Enter the value of n");
 * int a = sc.nextInt();
 * int n =1;
 * for (int i = 1; i <= a; i++) {
 * n=i;
 * for ( int k=1; k<=(a-i);k++){
 * System.out.print(" ");
 * }
 * for (int j = 1; j<=i; j++) {
 * System.out.print(n + " ");
 * n++;
 * }
 * System.out.println("");
 * }
 * sc.close();
 * }
 * }
 */