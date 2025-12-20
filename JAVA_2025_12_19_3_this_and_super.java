
class A{
    public A(){
        System.out.println("in a");
    }
    public A(int num){
        System.out.println("in a with: "+num);
    }
}

class B extends A{
    public B(){
        super(15);//runs the constructor with a int as parameter
        System.out.println("in b");
    }
    public B(int num){
        super(num);//runs the constructor with a int as parameter
        System.out.println("in b with: "+num);
        // super(num);
    }
}

public class JAVA_2025_12_19_3_this_and_super {
    public static void main(String[] args) {
        // B obj=new B(5);
        B obj=new B();

    }
}
