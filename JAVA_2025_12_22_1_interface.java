interface Computer{
    String location="Office";//in interface the variable will always be static(can't have different value for each object) and final(can't change)
    void code();
    String config();
}

interface Office extends Computer{//interfaces can extend another interface
    void format();
}
interface Home{
    void format();
}

class Laptop implements Computer,Home{//can implement multiple interface
    public void code(){
        System.out.println("coding.");
    }
    public String config(){
        return "Laptop Configaration";
    }
    public void format(){
        System.out.println("work from office.");
    }
}

class Desktop implements Office{
    public void code(){
        System.out.println("coding faster.");
    }
    public String config(){
        return "Desktop Configaration";
    }
    public void format(){
        System.out.println("work from Home.");
    }
}

class Employee{
    public void runningCode(Computer comp){
        comp.code();
        System.out.println(comp.config());
    }
}

public class JAVA_2025_12_22_1_interface {
    public static void main(String[] args) {
        Computer lap=new Laptop();
        Computer desk=new Desktop();

        Employee emp=new Employee();
        emp.runningCode(desk);
        emp.runningCode(lap);
        // emp.location;//can't access it as its static
        System.out.println(Computer.location);
    }
}
