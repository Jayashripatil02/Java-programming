package exceptionhandling;
import java.util.Scanner;
public class ExceptionHandlingEx {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number for Division:");
        Integer n=sc.nextInt();
        Integer div=0;
        try{
            div=100/n;
        }catch(ArithmeticException e){
            System.out.println("the number" +n+ "can not divisible by 100");
            e.printStackTrace();
        }
        finally{
            System.out.println("division=" +div);
        }

    }
}
