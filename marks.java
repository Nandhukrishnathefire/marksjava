import java.util.Scanner;

public class Studentgrade {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double total();

        System.out.print("Enter english marks: ");
        double a = sc.nextDouble();

        System.out.print("Enter tamil marks: ");
        double b = sc.nextDouble();
         
        System.out.print("Enter computer science number: ");
        double c = sc.nextDouble();
        
        System.out.print("Enter life skill marks: ");
        double d = sc.nextDouble();
        
        System.out.print("Enter maths marks: ");
        double e = sc.nextDouble();

        System.out.println("total: " + (a+b+c+d+e));
        System.out.println("average: " + (total/5));
        if (total>=300) {
           System.out.print("pass ");
        } 
        else {
             System.out.print(" fail");
       }

    }
}
