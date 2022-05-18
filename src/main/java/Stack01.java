import java.util.*;
import java.util.stream.IntStream;

public class Stack01 {
    public static void main(String[] args) {

       // int[] progresses = {93,30,55};
        int[] progresses = {95,95,99,99,99 ,92};
        //int[] speeds = {1,30,5};
        int[] speeds = {1,1,1,1,1,1};


        List<Integer> days = new ArrayList<>();

        int a = 0;

       while (a <progresses.length) {
           int c = 0;
           for (int i = 0; i < progresses.length; i++) {
               progresses[i] += speeds[i];
           }
           if(progresses[a] >= 100){
               c++;
               a++;
               if(a < progresses.length){
                   for(int i = a ; progresses[i] >= 100;i++) {
                       a++;
                       c++;
                       if( a >= progresses.length){
                           break;
                       }
                   }
               }




               days.add(c);
           }

       }

        for (int b:
             days) {
            System.out.println(b);
        }



    }
}
