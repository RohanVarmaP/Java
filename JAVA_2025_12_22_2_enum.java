// enum Status{
//     Running,Failed,Pending,Success
// }

enum Laptop{
    Macbook(2000),XPS(200),Surface,ThinkPad(1800);
    private int price;
    private Laptop(int price){
        this.price=price;
    }
    private Laptop(){
        this.price=1000;
    }
    public void setters(int price){
        this.price=price;
    }
    public int getter(){
        return price;
    }
}

public class JAVA_2025_12_22_2_enum {
    public static void main(String[] args) {
        // Status s=Status.Success;
        // System.out.println(s);
        // System.out.println(s.ordinal());

        // for multiple values
        // Status[] s=Status.values();
        // for (Status ss: s){
        //     System.out.println(ss);
        // }

        //comparing status
        // Status s=Status.Success;
        // if(s==Status.Failed){
        //     System.out.println("sorry it failed.");
        // }else if(s==Status.Success){
        //     System.out.println("it Worked.");
        // }else if(s==Status.Pending){
        //     System.out.println("sorry it not started.");
        // }else if(s==Status.Running){
        //     System.out.println("its currently running.");
        // }
        // switch (s) {// it knows that s belongs to Status enum so no need to add status for each case
        //     case Failed:
        //         System.out.println("sorry it failed.");
        //         break;
        //     case Success:
        //         System.out.println("it Worked.");
        //         break;
        //     case Pending:
        //         System.out.println("sorry it not started.");
        //         break;
        //     case Running:
        //         System.out.println("its currently running.");
        //         break;
        //     default:
        //         break;
        // }

        //adding class to enum
        Laptop lap=Laptop.Macbook;
        System.out.println(lap+": "+lap.getter());
        for(Laptop laps: Laptop.values()){
            System.out.println(laps+": "+laps.getter());
        }
    }
}
