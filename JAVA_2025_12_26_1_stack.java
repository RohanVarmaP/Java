class Stack{
    private int size=5;
    private int stack[]=new int[size];
    private int top=0;

    public Stack(int size) {
        this.size = size;
    }
    public Stack() {
        this.size = 5;
    }

    public boolean isEmpty(){
        return top==0?true:false;
    }

    public boolean isFull(){
        return top==size?true:false;
    }

    public void push(int num){
        if(!isFull()){
            stack[top]=num;
            top++;
        }else{
            System.out.println("Exceeded Stack limit.");
        }
    }

    public int pop(){
        if(!isEmpty()){
            int num=stack[top-1];
            stack[top-1]=0;
            top--;
            return num;
        }else{
            System.out.println("Stack is empty.");
            return -1;
        }
    }

    public int peek(){
        if(!isEmpty()){
            return stack[top-1];
        }else{
            System.out.println("Stack is empty.");
            return -1;
        }
    }
}


public class JAVA_2025_12_26_1_stack {
    public static void main(String[] args) {
        Stack s=new Stack(3);
        s.push(2);
        System.out.println("peek: "+s.peek()); 
        s.push(3);
        System.out.println("peek: "+s.peek()); 
        s.push(1);
        System.out.println("peek: "+s.peek()); 
        s.push(6);
        System.out.println("peek: "+s.peek());
        System.out.println("pop: "+s.pop());
        System.out.println("peek: "+s.peek());
        System.out.println("pop: "+s.pop());
        System.out.println("peek: "+s.peek());
        System.out.println("pop: "+s.pop());
        System.out.println("peek: "+s.peek());
        System.out.println("pop: "+s.pop());
        System.out.println("peek: "+s.peek());
    }
}