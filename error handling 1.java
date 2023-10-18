import java.util.Scanner;
 public class Main{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
     int n;
     System.out.println("enter value of n");
     n = sc.nextInt();
    try{
        int dividebyzero=5/n;
      
        System.out.println("rest of code in try block" );
    }
    catch (ArithmeticException err){
        System.out.println("ArithmeticException=>"+err.getMessage());
    }
    }
}
