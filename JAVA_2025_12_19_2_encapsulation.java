
// class Human{
//     private int age;
//     private String name;
//     public void setter(int age,String name){
//         this.age=age;
//         this.name=name;
//     }
//     public int getAge(){
//         return age;
//     }
//     public String getName(){
//         return name;
//     }
// }

class Human{
    private int age;
    private String name;
    public Human(int age,String name){
        this.age=age;
        this.name=name;
    }
    public Human(){
        this.age=15;
        this.name="Raj";
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
}

public class JAVA_2025_12_19_2_encapsulation{
    public static void main(String args[]){
        // Human per1=new Human();
        // per1.setter(20, "rahul");
        // System.out.println(per1.getName()+": "+per1.getAge()+" Years.");

        //constructor
        Human per1=new Human(20, "Rahul");
        Human per2=new Human();
        System.out.println(per1.getName()+": "+per1.getAge()+" Years.");
        System.out.println(per2.getName()+": "+per2.getAge()+" Years.");
    }
}