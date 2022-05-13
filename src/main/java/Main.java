import java.util.*;
public class Main{
    public static void main(String[] args) {
        List<String> pList = new ArrayList<String>();
        pList.add("홍길동");
        pList.add("이협건");
        pList.add("고길동");
        pList.add("둘리");

       pList.forEach(System.out::println);
       pList.forEach(System.out::println);
        for (var a: pList
             ) {
            System.out.println(a);
        }

    }

}