class Stack{
    private int stack[]=new int[5];
    private int top=0;

    public void push(int num){
        if(top!=5){
            stack[top]=num;
            top++;
        }else{
            System.out.println("Exceeded Stack limit.");
        }
    }

    public void pop(){
        if(top!=0){
            stack[top]=0;
            top--;
        }else{
            System.out.println("Stack is empty.");
        }
    }

    public int peek(){
        if(top!=0){
            return stack[top-1];
        }else{
            System.out.println("Stack is empty.");
            return -1;
        }
    }
}


public class JAVA_2025_12_26_1_stack {
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(2);
        s.peek(); 
        s.push(3);
        s.peek(); 
        s.push(1);
        s.peek(); 
        s.push(6);
        s.peek(); 
        s.pop();
        s.peek();
        s.pop();
        s.peek();
        s.pop();
        s.peek();
}
