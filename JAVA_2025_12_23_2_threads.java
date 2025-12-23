// class A extends Thread{
//     public void run(){
//         for(int i=0;i<10;i++){
//             System.out.println("Hello world."); 
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

// class B extends Thread{
//     public void run(){
//         for(int i=0;i<10;i++){
//             System.out.println("I am B."); 
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

// class A implements Runnable{
//     public void run(){
//         for(int i=0;i<10;i++){
//             System.out.println("Hello world."); 
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

// class B implements Runnable{
//     public void run(){
//         for(int i=0;i<10;i++){
//             System.out.println("I am B."); 
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

class Counter{
    int count;
    public synchronized void count(){
        count++;
    }
}

public class JAVA_2025_12_23_2_threads {
    public static void main(String[] args) throws InterruptedException {
        // A a=new A();
        // B b=new B();
        // b.setPriority(10);
        // System.out.println(a.getPriority());
        // System.out.println(b.getPriority());
        // a.start();
        // b.start();

        // using runnables
        // Runnable a=new A();
        // Runnable b=new B();
        // Thread t1=new Thread(a);
        // Thread t2=new Thread(b);
        // t1.start();
        // t2.start();

        //using lamda function and Anonymous
        // Runnable a=()->{
        //     for(int i=0;i<10;i++){
        //         System.out.println("Hello world."); 
        //         try {
        //             Thread.sleep(10);
        //         } catch (InterruptedException e) {
        //             e.printStackTrace();
        //         }
        //     }
        // };
        // Runnable b=()->{
        //     for(int i=0;i<10;i++){
        //         System.out.println("I am B."); 
        //         try {
        //             Thread.sleep(10);
        //         } catch (InterruptedException e) {
        //             e.printStackTrace();
        //         }
        //     }
        // };
        // Thread t1=new Thread(a);
        // Thread t2=new Thread(b);
        // t1.start();
        // t2.start();

        //race condition
        Counter c=new Counter();
        Runnable a=()->{
            for(int i=0;i<10000;i++){
                c.count();
            }
        };
        Runnable b=()->{
            for(int i=0;i<10000;i++){
                c.count();
            }
        };
        Thread t1=new Thread(a);
        Thread t2=new Thread(b);
        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println(c.count);
    }
}
