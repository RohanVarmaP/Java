class NewException extends Exception{//this is how ypu create a new exception
    public NewException(String str){
        super(str);
    }
}

class A{
    public void show(int i) throws Exception{//this how to use throws
        System.out.println(120/i);
    }
}

public class JAVA_2025_12_22_4_exceptions {
    public static void main(String[] args) {
        int i=0;
        try { 
            System.out.println("before error");
            if(i!=0){
                int j=50/i;
                System.out.println(j);
                throw new Exception("this is a artificial error");//how to use throw
            }else {
                throw new NewException("this is a new artificial error\"");
            }
        } catch (ArithmeticException e) {
            System.out.println("error found: "+e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("error found: "+e);
        }catch (Exception e){
            System.out.println("error found: "+e);
        }catch(Error e){
            System.out.println("error found: "+e);
     }
        System.out.println("try-catch done");

        A a=new A();
        try{
            a.show(0);
        }catch (Exception e){
            System.out.println("Method is throwing an error.");
        }
    }
}
