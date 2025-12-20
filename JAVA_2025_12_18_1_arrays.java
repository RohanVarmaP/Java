class Student{
    int rollno;
    String name;
    int marks;
}


public class JAVA_2025_12_18_1_arrays{
    public static void main(String a[]){
        // int num[]={3,4,5};
        // num[1]=7;
        // System.out.println(num[1]);

        //creating a empty array
        // int num[]=new int[4];
        // num[0]=7;
        // num[1]=8;
        // num[2]=9;
        // // System.out.println(num[1]+"' a '"+num[3]);
        // for(int i=0;i<4;i++){
        //     System.out.println(num[i]);
        // }

        //Creating a multi dimentional array
        // int num[][]=new int[3][4];
        // for (int i=0;i<3;i++){
        //     for(int j=0;j<4; j++){
        //         num[i][j]=i + "" + j;
        //     }
        // }
        // for (int i=0;i<3;i++){
        //     for(int j=0;j<4; j++){
        //         num[i][j]=(int)(Math.random()*100);
        //     }
        // }
        // for (int i=0;i<3;i++){
        //     for(int j=0;j<4; j++){
        //         System.out.print(num[i][j]+", ");
        //     }
        //     System.out.println("");
        // }
        // for(int n[]:num){
        //     for(int val:n){
        //         System.out.print(val+", ");
        //     }
        //      System.out.println("");
        // }

        //creating a multi dimentional array with different lenght
        // int num[][]=new int[3][];
        // num[0] =new int[4];
        // num[1] =new int[5];
        // num[2] =new int[6];
        // for(int i=0;i<3;i++){
        //     for(int j=0;j<num[i].length;j++){
        //         num[i][j]=(int)(Math.random()*100);
        //     }
        // }
        // for(int n[]:num){
        //     for(int val:n){
        //         System.out.print(val+", ");
        //     }
        //      System.out.println("");
        // }

        //Creating a class object
        Student s1=new Student();
        s1.name="rr";
        s1.marks=95;
        s1.rollno=1;
        Student s2=new Student();
        s2.name="vv";
        s2.marks=85;
        s2.rollno=2;
        Student s3=new Student();
        s3.name="pp";
        s3.marks=90;
        s3.rollno=3;

        //creating multiple objects as in an array'
        Student students[]=new Student[3];
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;

        for (Student stu: students){
            System.out.println(stu.rollno);
        }
    }
}