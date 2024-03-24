public class Contact {
    public String name;
    public String mobile;
    public String email;
    public int age;

    public Contact() //Default Constructor
    {
        this.name="";
        this.mobile="";
        this.email="";
        this.age=0;
    }
    public Contact(String name, String mobile, String email, int age)//parameterize constructor
    {
        this.name=name;
        this.mobile=mobile;
        this.email=email;
        this.age=age;
    }
    public Contact(Contact c)//parameterize constructor
    {
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
        Contact c = new Contact(); //using default constructor
        c.show();
        Contact c1 = new Contact("jayu", "8767396755", "jayashripatil@gmail.com", 20);//using parameter Constructor
        c1.show();
        Contact c2 = new Contact(c1);//using copy constructor
        c2.show();
    }
}