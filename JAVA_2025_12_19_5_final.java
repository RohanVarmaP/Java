
// final class Cal{ //this is make it immpossible to extend
//     public void show(){
//         System.out.println("hello");
//     }
//     public void add(int num1,int num2){
//         System.out.println(num1+num2);
//     }
// }

class Cal{ //this is make it immpossible to extend
    final public void show(){//this make it immpossible to overide the method
        System.out.println("hello");
    }
    public void add(int num1,int num2){
        System.out.println(num1+num2);
    }
}

// class AdvCal extends Cal{
//     public void show(){
//         System.out.println("hello");

//     }
// }

public class JAVA_2025_12_19_5_final {
    public static void main(String[] args) {
        final int num=8;//it will become a unmutable integer
        // num=9;
        System.out.println(num);
        Cal c=new Cal();
        c.show();
        c.add(3,7);
    }
}
