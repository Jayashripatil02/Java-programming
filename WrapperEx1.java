//autoboxing example of int to Integer
public class WrapperEx1{
    public static void main(String args[])
    {
        int a=20;
        Integer i=Integer.valueOf(a);
        Integer j=a;

        System.out.println(a+""+i+""+j);
    }
}