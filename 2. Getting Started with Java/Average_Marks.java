import java.util.Scanner;
public class Average_Marks{
    public static void main (String[] Args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of students and marks of student"); //Optional statement
        char name = sc.next().charAt(0);//Name as a Single Character
        int m1=sc.nextInt();
        int m2=sc.nextInt();
        int m3=sc.nextInt();
        int avg = (m1+m2+m3)/3; // according to question output should be of int type
        System.out.println(name);//name of student
        System.out.println(avg);//average marks
        sc.close();
    }
}