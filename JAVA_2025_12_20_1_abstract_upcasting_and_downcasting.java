class A{

    public void show1(){
        System.out.println("in A");
    }
}

class B extends A{
    public void show2(){
        System.out.println("in B");
    }
}


abstract class Car{
    public abstract void drive();
    public void PlayMUsic(){
        System.out.println("playing Music");
    }
}

class Shift extends Car{
    public void drive(){
        System.out.println("Driving");
    }
    public void PlayMUsic(){
        System.out.println("playing Music");
    }
}


public class JAVA_2025_12_20_1_abstract_upcasting_and_downcasting {
    public static void main(String[] args) {
        // double d=1.25;
        // int i=(int) d;
        // System.out.println(i);

        // A obj=(A) new B();//upcasting
        // obj.show1();


        // B ob=(B) obj;//downcasting
        // ob.show2();

        // int num=7;
        // Integer num1=num;//autoboxing
        // Integer num2=num1;//auto-unboxing
        // System.out.println(num2);

        // String tsr="120";
        // Integer num3=Integer.parseInt(tsr);
        // System.out.println(num3);

        // Car obj=new Car();//can't create a abstract class object
        Shift obj=new Shift();
        obj.PlayMUsic();
    }
}
