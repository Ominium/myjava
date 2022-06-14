
import java.util.*;
import java.util.Map.Entry;
public class KAKAOnum1 {
    public static void main(String[] args) {
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
        int k = 2;
        HashSet<String> report2 = new HashSet<String>();
        for (String a : report) {
          report2.add(a);
        }
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        HashMap<String, Integer> pmap = new HashMap<>();
        int[] result = new int[id_list.length];
        for (String a : report2) {
            int blankidx = a.indexOf(" ");
            String re1 = a.substring(0,blankidx);
            String re2 = a.substring(blankidx+1);
            ArrayList<String> report3 = map.getOrDefault(re2,null);
            if(report3 == null)report3 = new ArrayList<>();
            report3.add(re1);
            map.put(re2,report3);
        }
        for(ArrayList<String> list : map.values()){
            if(list.size()>= k){
                for(String a : list){
                    pmap.put(a,pmap.getOrDefault(a,0)+1);
                }
            }
        }
        for(int i= 0; i < id_list.length;i++){
            result[i] = pmap.getOrDefault(id_list[i],0);
        }
        for(int a : result){
            System.out.println(a);
        }
         String a =  report[0].split("\"")[2];
    }
}

