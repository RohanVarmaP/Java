
// class Mobile{
//     static String brand;
//     int price;
//     String name;

//     public void show(){
//         System.out.println("brand: "+brand+", Name: "+name+", Price: "+price+".");
//     }
// }

// class Mobile{
//     static String brand;
//     int price;
//     String name;

//     public Mobile(){
//         brand="Vivo";
//         System.out.println("in constructor");
//     }

//     static{
//         brand="IQoo";
//         System.out.println("in Static");
//     }

//     public void show(){
//         System.out.println("brand: "+brand+", Name: "+name+", Price: "+price+".");
//     }
// }

class Mobile{
    static String brand;
    int price;
    String name;

    public static void showing(Mobile obj){
        System.out.println("brand: "+brand+", Name: "+obj.name+", Price: "+obj.price+".");
    }

    public void show(){
        System.out.println("brand: "+brand+", Name: "+name+", Price: "+price+".");
    }
}

public class JAVA_2025_12_19_1_static {
    public static void main (String args[]) throws ClassNotFoundException{
        // Mobile ob1=new Mobile();
        // ob1.brand="Oppo";
        // ob1.name="K3";
        // ob1.price=15000;

        // ob1.show();

        // Mobile ob2=new Mobile();
        // ob2.brand="Vivo";
        // ob2.name="k4";
        // ob2.price=19000;

        // ob1.show();
        // ob2.show();

        //Static block
        // Mobile ob1=new Mobile();
        // ob1.brand="Oppo";
        // ob1.name="K3";
        // ob1.price=15000;

        // Mobile ob2=new Mobile();
        // ob2.name="k4";
        // ob2.price=19000;
        // Class.forName("Mobile");

        //static method
        Mobile ob1=new Mobile();
        // ob1.brand="Oppo";
        ob1.name="K3";
        ob1.price=15000;
        Mobile.showing(ob1);//works with class not object
    }
}
