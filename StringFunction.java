public class StringFunction
{
    public static void main(String[] args) {
        String name = "Test";
        //length function
        System.out.println("Length Function="+name.length());
        //split
        String msg = "SSBT collage of Engineering";
        String[] strArray=msg.split("");
        //System.out.println("Split function="+split());
        for(String s: strArray)
        {
            System.out.println(s);
        }
        //split function
        String cityNames="Jalgoan,Pune,Kalayan,Mumbai";
        System.out.println("\nBefore split="+cityNames);
        String[] cityArray = cityNames.split(",");
        System.out.println("\nAfter split=");
        for(String s:cityArray)
        {
            System.out.println(s);
        }
        //compare to function
        String str1="Java programming";
        String str2="Java programming";
        String str3="Java Programming";
        System.out.println(str1.compareTo(str2));
        System.out.println(str2.compareTo(str2));
        System.out.println(str3.compareTo(str3));
        //replace
        System.out.println("\n3.Replace");
        String msg1 ="Happy birthday";
        System.out.println("Before replace="+msg1);
        System.out.println("After replace="+msg1.replace("birthday","sunday"));
        //Substring
        System.out.println("\n4.Substring()");
        String msg2 = msg1.substring(0,5);
        System.out.println(msg2);
        //IndexOf
        System.out.println("\n5.indexOf()");
        System.out.println("IndexOf b in msg1="+msg1.indexOf("b"));
        //contain
        System.out.println("\n6.contain()");
        System.out.println("msg1 contain Happy="+msg1.contains("Happy"));
        //charAt
        System.out.println("\n7.charAt()");
        System.out.println("charAt index 4="+msg1.charAt(4));
        //Trim
        System.out.println("\n8.trim()");
        String msg4 = "Good Morning Everyone";
        System.out.println("Trim all spaces="+msg4.trim());
    }
}
