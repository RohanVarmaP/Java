class A{
    private String name;
    private int age;
    public void setter(String name,int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void show(){
        System.out.println("in class A");
    }
    static class B{
        public void name(){
            System.out.println("in Class B");
        }
    }
}


public class JAVA_2025_12_20_2_Innerclass {
    public static void main(String[] args) {
        // System.out.println("hello");
        // A obj =new A();
        // obj.setter("ram", 26);
        // System.out.println(obj.getAge());
        // System.out.println(obj.getName()); 

        // A.B obj1=new A.B();
        // obj1.name();

        //Anonymous Inner Class
        A obj=new A(){
            public void show(){
                System.out.println("in new class A");
            }
        };
        obj.show();
    }
}
