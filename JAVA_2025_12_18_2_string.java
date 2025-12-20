public class JAVA_2025_12_18_2_string {
    public static void main(String args[]) {
        // creating a empty string and assigning a value
        // String name=new String();
        // name="Hello";
        // System.out.println(name);

        // assigning a value using constructor of string
        // String name = new String("Hello");
        // System.out.println(name + " World");
        // System.out.println(name.concat(", Good Morning"));
        // System.out.println(name);

        //String buffer
        StringBuffer sb=new StringBuffer();
        System.out.println(sb.capacity());
        StringBuffer sl=new StringBuffer("rrr");
        System.out.println(sl.capacity());
    }
}
