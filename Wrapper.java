class autoboxing{
    int a=20;
    Integer i=Integer.valueOf(a);
    Integer j=a;
    void print(){
        System.out.println(a+""+i+""+j);
    }
}
class unboxing extends autoboxing{
    Integer a = new Integer (3);
    int i = a.intValue();
    int j = a;
    void display() {
        System.out.println(a + " " + i + " " + j);
    }
}
public class Wrapper {
    public static void main(String args[]) {
        unboxing obj = new unboxing();
        obj.display();
        obj.print();

    }
}