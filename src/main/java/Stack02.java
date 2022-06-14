import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Stack02 {
    public static void main(String[] args) {
        //int[] priorities = {2,1,3,2};
        int[] priorities = {1,1,9,1,1,1};
       // int location =2;
       int location = 0;
        Stack02 stack02 = new Stack02();
        System.out.println(stack02.solution(priorities,location));
    }
    public int solution(int[] priorities, int location){
        int answer = 0;
        print[] prints = new print[priorities.length];
        for(int i= 0; i< prints.length; i++){
            prints[i] = new print(i,priorities[i]);
        }
        List<print> printList = new ArrayList<>();
        for(int i = 0; i< prints.length; i++){
            printList.add(prints[i]);
        }
        printList.sort(Collections.reverseOrder());
        for(int i = 0; i< prints.length; i++){
            for(int j = 0;  j< prints.length;j++){
                if(i!=j){
                    if(prints[i].number < prints[j].number){
                        print print;
                        print = prints[i];
                        for(int z = i; z< prints.length - 1; z++){
                            prints[z] = prints[z+1];
                        }
                        prints[prints.length - 1] = print;
                        break;
                    }

                }
            }
        }
        for(int i = 0; i< prints.length; i++){
            System.out.println(prints[i].rank);
            System.out.println(prints[i].number);
        }
        for(int i =0 ; i< prints.length; i++){
            if(prints[i].rank == location){
                answer = i + 1 ;
            }
        }

        return answer;
    }
}
class print implements Comparable<print> {
    int rank;
    int number;
    public print(int a, int b){
        this.rank = a;
        this.number = b;
    }

    @Override
    public int compareTo(print print) {
        if(print.number< number){
            return 1;
        }
        else if(print.number> number){

            return -1;
        }
        return 0;
    }
}
