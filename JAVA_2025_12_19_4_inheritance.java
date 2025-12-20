
class Cal{
    public Cal(){
        System.out.println("in class Cal.");
    }
    public int add(int num1, int num2){
        return num1+num2;
    }
    public int sub(int num1, int num2){
        return num1-num2;
    }
    public int mul(int num1, int num2){
        return num1*num2;
    }
    public int div(int num1, int num2){
        return num1/num2;
    }
}
class AdvCal extends Cal{
    public AdvCal(){
        System.out.println("in class AdvCal.");
    }
    public int Square(int num){
        System.out.println("in AdvCal");
        return num*num;
    }
    public double SquareRoot(int num){
        return Math.sqrt(num);
    }
}
class VeryAdvCal extends AdvCal{
    public VeryAdvCal(){
        System.out.println("in class VeryAdvCal.");
    }
    public double power(int num1, int num2){
        return Math.pow(num1, num2);
    }
    public int Square(int num){
        System.out.println("in veryAdvCal");
        return num*num;
    }
}



public class JAVA_2025_12_19_4_inheritance {
    public static void main(String[] args) {
        // AdvCal a=new AdvCal();
        // System.out.println(a.add(15,16));
        // System.out.println(a.SquareRoot(25));
        VeryAdvCal a=new VeryAdvCal();
        System.out.println(a.add(15,16));
        System.out.println(a.Square(25));
        System.out.println(a.power(2,5));
    }
}
