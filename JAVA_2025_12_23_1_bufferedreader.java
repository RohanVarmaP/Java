import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class JAVA_2025_12_23_1_bufferedreader {
    public static void main(String[] args) throws IOException {
        // System.out.println("Enter a value");
        // InputStreamReader in=new InputStreamReader(System.in);
        // BufferedReader br=new BufferedReader(in);
        // int num=Integer.parseInt(br.readLine());
        // System.out.println(num);
        // br.close();

        //using scanner
        Scanner sn=new Scanner(System.in);
        System.out.println("Enter a value");
        int num= sn.nextInt();
        System.out.println(num);
        sn.close();
    }
}
