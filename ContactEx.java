import java.util.Scanner;
public class ContactEx{
    public String name;
    public String mobile;
    public String email;
    public int age;

    public ContactEx() //Default Constructor
    {
        System.out.println("*********** Default constructor ************");
        this.name="";
        this.mobile="";
        this.email="";
        this.age=0;
    }
    public ContactEx(String name, String mobile, String email, int age)//parameterize constructor
    {
        System.out.println("*********** Parametrized Constructor **********");
        this.name=name;
        this.mobile=mobile;
        this.email=email;
        this.age=age;
    }
    public ContactEx(ContactEx c)//copy constructor
    {
        System.out.println("********** Copy Constructor ***********");
        this.name = c.name;
        this.mobile = c.mobile;
        this.email = c.email;
        this.age = c.age;
    }

    public void show() {

        System.out.println("\nName=" + this.name);
        System.out.println("\nMobile=" + this.mobile);
        System.out.println("\nEmail=" + this.email);
        System.out.println("\nAge=" + this.age);
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name=");
        String name= sc.nextLine();
        System.out.println("Enter mobile=");
        int mobile= sc.nextInt();
        System.out.println("Enter email=");
        String email= sc.next();
        System.out.println("Enter age=");
        int age= sc.nextInt();

        ContactEx c = new ContactEx(); //using default constructor
        c.show();
        ContactEx c1 = new ContactEx("jayu", "8767396755", "jayashripatil@gmail.com", 20);//using parameter Constructor
        c1.show();
        ContactEx c2 = new ContactEx(c1);//using copy constructor
        c2.show();
    }
}