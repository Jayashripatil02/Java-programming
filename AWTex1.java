import java.awt.*;
public class AWTex1 extends Frame{
    AWTex1(){
        Button b=new Button("Click me");
        b.setBounds(30,100,80,30);
        add(b);
        setSize(300,300);
        setTitle("This is our basic AWT example");
        setLayout(null);
        setVisible(true);
    }
    public static void main(String args[])
    {
        AWTex1 f=new AWTex1();
    }
}