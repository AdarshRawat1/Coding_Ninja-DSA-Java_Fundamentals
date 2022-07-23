import java.util.Scanner;
public class Percentage
{
     public static void main ( String [] args )
    {
         Scanner sc =new Scanner(System.in);
         String msg = "Enter marks in 5 subjects";
         System.out.println(msg);
         int sub1= sc.nextInt();
         int sub2= sc.nextInt();
         int sub3= sc.nextInt();
         int sub4= sc.nextInt();
         int sub5= sc.nextInt();
         float sum = (float)(sub1+sub2+sub3+sub3+sub4+sub5);
         float per= (float)((sum/500)*100); //assuming all the marks to be out of 100 -> 5 Subjects*100 marks = 500 total
         System.out.println("Percentage="+ per);
         sc.close();
    }
}