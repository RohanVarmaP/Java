// import java.util.ArrayList;
// import java.util.Collection;
import java.util.ArrayList;
// import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
// import java.util.HashMap;
// import java.util.HashSet;
// import java.util.Hashtable;
// import java.util.Map;
import java.util.List;
// import java.util.Set;
// import java.util.TreeSet;

class Student implements Comparable<Student>{
    int rollno;
    String name;
    public Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }
    @Override
    public String toString() {
        return ("Roll.no: "+rollno+", Name: "+name+".");
    }
    @Override
    public int compareTo(Student that) {// to make it work for normal sort
        if(this.rollno%10>that.rollno%10){
            return 1;
        }else{
            return -1;
        }
    }
    
}

public class JAVA_2025_12_23_3_collection_API {
    public static void main(String[] args) {
        // List<Integer> num =new ArrayList<Integer>();
        // num.add(146);
        // num.add(16);
        // num.add(46);
        // num.add(146);
        // num.add(14);
        // System.out.println(num.indexOf(46));
        // System.out.println(num.getFirst());
        // System.out.println(num.getLast());
        // System.out.println(num.get(2));
        // for(int i:num){
        //     System.out.println(i);
        // }

        // Set<Integer> num =new HashSet<Integer>();
        // num.add(146);
        // num.add(16);
        // num.add(46);
        // num.add(146);//will not accept duplecate values
        // num.add(14);
        // num.add(14);//will not accept duplecate values
        // for(int i:num){
        //     System.out.println(i);
        // }

        // Set<Integer> num =new TreeSet<Integer>();
        // num.add(146);
        // num.add(16);
        // num.add(46);
        // num.add(146);//will not accept duplecate values
        // num.add(14);
        // num.add(14);//will not accept duplecate values
        // for(int i:num){
        //     System.out.println(i);
        // }

        // Map<String,Integer> num =new HashMap<String,Integer>();
        // num.put("raju",146);
        // num.put("ram",14);
        // num.put("ravi",16);
        // num.put("rahul",46);
        // num.put("rajesh",6);
        // num.put("ramesh",1);
        // num.put("roshan",4);
        // System.out.println(num.get("roshan"));
        // for(String s:num.keySet()){
        //     System.out.println(s+": "+num.get(s));
        // }

        // Map<String,Integer> num =new Hashtable<>();
        // num.put("raju",146);
        // num.put("ram",14);
        // num.put("ravi",16);
        // num.put("rahul",46);
        // num.put("rajesh",6);
        // num.put("ramesh",1);
        // num.put("roshan",4);
        // System.out.println(num.get("roshan"));
        // for(String s:num.keySet()){
        //     System.out.println(s+": "+num.get(s));
        // }

        //Sorting
        // List<Integer> num= new ArrayList<>();
        // num.add(1460);
        // num.add(19);
        // num.add(43);
        // num.add(12);
        // num.add(194);
        // System.out.println(num);

        // //sorting based on the last digit of each value
        // Comparator com= new Comparator<Integer>() {
        //     public int compare(Integer i, Integer j){
        //         if(i%10>j%10){
        //             return 1;
        //         }else{
        //             return -1;
        //         }
        //     }
        // };
        // Collections.sort(num, com);
        // System.out.println(num);

        // //sorting all the values
        // Collections.sort(num);
        // System.out.println(num);

        //Sorting classes
        List<Student> num= new ArrayList<>();
        num.add(new Student(1420, "Raj"));
        num.add(new Student(19, "Ram"));
        num.add(new Student(43, "Rajesh"));
        num.add(new Student(12, "Ramesh"));
        num.add(new Student(15, "Ravi"));
        num.add(new Student(194, "Rahul"));
        for(Student s:num){
            System.out.println(s);
        }

        //sorting based on the last digit of each value
        Comparator<Student> com= (i, j)->(i.rollno%10>j.rollno%10)?1:-1;
        System.out.println("afetr sorting with last digit of roll no of each student.");
        Collections.sort(num, com);
        for(Student s:num){
            System.out.println(s);
        }

        //sorting all the values
        System.out.println("afetr sorting with last digit of roll no of each student.");
        Collections.sort(num);
        for(Student s:num){
            System.out.println(s);
        }
    }
}
