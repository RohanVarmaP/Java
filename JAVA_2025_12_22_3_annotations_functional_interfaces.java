
// class A{
//     public void show(){
//         System.out.println("in class A.");
//     }
// }

// class B extends A{
//     @Override//make sure this method is overriding a method from its superclass
//     public void show(){
//         System.out.println("in class B.");
//     }
// }

@FunctionalInterface
interface A {
    public void show();
    // public void tell();
}

@FunctionalInterface
interface AB {
    public void show(int i);
    // public void tell();
}

@FunctionalInterface
interface ABC {
    public String show(int i, String j);
    // public void tell();
}

class B implements A{
    public void show(){
        System.out.println("from B, Hello World.");
    }
}

class BC implements AB{
    public void show(int i){
        System.out.println("from B, Hello World.: "+i);
    }
}

class BCD implements ABC{
    public String show(int i, String j){
        return "from B, Hello World.: "+i +j;
    }
}


public class JAVA_2025_12_22_3_annotations_functional_interfaces {
    public static void main(String[] args) {
        // B b=new B();
        // b.show();

        //with no parameters
        B b=new B();
        b.show();

        A obj=new A(){//Anonymous function
            public void show(){
                System.out.println("from A, Hello world.");
            }
        };
        obj.show();

        A obj1=()->{//lamda function
                System.out.println("from Lamda, Hello world.");
            };
        obj1.show();

        //with one parameters
        BC bc=new BC();
        bc.show(15);

        AB obj2=new AB(){//Anonymous function
            public void show(int i){
                System.out.println("from A, Hello world.: "+i);
            }
        };
        obj2.show(12);

        //lamda function
        AB obj3= i->System.out.println("from Lamda, Hello world.: "+i);
        obj3.show(20);

        //with two different parameters with a datatype as return
        BCD bcd=new BCD();
        System.out.println(bcd.show(15," rupees"));

        ABC obj4=new ABC(){//Anonymous function
            public String show(int i,String j){
                return "from A, Hello world.: "+i+j;
            }
        };
        System.out.println(obj4.show(12," rupees"));

        //lamda function
        ABC obj5= (i,j)->"from Lamda, Hello world.: "+i+j;
        System.out.println(obj5.show(20," rupees"));
    }
}
