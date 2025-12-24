// import java.lang.reflect.Array;
// import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class JAVA_2025_12_24_1_Stream_API {
    public static void main(String[] args) {
        List<Integer> num=Arrays.asList(4,9,3,2,6,5);

        //adding all the even number in a list
        // int sum=0;
        // for(int n:num){
        //     if(n%2==0){
        //         sum=sum+n;
        //     }
        // }
        // System.out.println(num);
        // System.out.println(sum);
        // num.forEach(n->System.out.println(n));

        //using Stream
        // Stream<Integer> s1=num.stream();
        // Stream<Integer> s2=s1.filter(n->n%2==0);
        // Stream<Integer> s3=s2.map(n->n+2);
        // int result=s3.reduce(0,(c,e)->c+e);
        // // s1.forEach(n->System.out.println(n));
        // // s2.forEach(n->System.out.println(n));
        // // s3.forEach(n->System.out.println(n));
        // // s1.forEach(n->System.out.println(n));//can only used once.
        // System.out.println(result);

        // int result=num.stream()
        //     .filter(n->n%2==0)
        //     .map(n->n+2)
        //     .reduce(0,(c,e)->c+e);
        // System.out.println(result);

        Stream<Integer> s=num.stream()
            .filter(n->n%2==0)
            .map(n->n+2)
            .sorted();
        s.forEach(n-> System.out.println(n));
        
    }
}
