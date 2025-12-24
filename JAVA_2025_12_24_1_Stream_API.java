// import java.lang.reflect.Array;
// import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class JAVA_2025_12_24_1_Stream_API {
    public static void main(String[] args) {
        List<Integer> num=Arrays.asList(4,9,3,2,5);

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
        Stream<Integer> s1=num.stream();
        s1.forEach(n->System.out.println(n));
        
    }
}
