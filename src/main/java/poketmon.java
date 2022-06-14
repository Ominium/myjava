import java.util.ArrayList;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class poketmon {
    public static void main(String[] args) {
        int[] nums = {3,1,2,3};
        int[] nums2 = {3,3,3,2,2,2};
        int[] nums3 = {3,3,3,2,3,4};
        poketmon po = new poketmon();
        System.out.println(po.solution(nums));
        System.out.println(po.solution(nums2));
        System.out.println(po.solution(nums3));

    }
    public int solution(int[] nums){
        int anwser = 0;
        List<Integer> nums2 = new ArrayList<>();
        for(int i : nums){
            nums2.add(i);
        }
        Set<Integer> numslist = new HashSet<>(nums2);
        List<Integer> newlist = new ArrayList<>(numslist);
        if(nums.length /2 > newlist.size()){
            anwser = newlist.size();
        }
        else{
            anwser = nums.length /2 ;
        }
        return anwser;
    }
}
