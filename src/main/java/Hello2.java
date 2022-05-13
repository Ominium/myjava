

import java.util.Map.Entry;
import java.util.*;
public class Hello2 {
    public static void main(String[] args){
        String[][] clothes = new String[5][2];
        HashMap<String,Integer> pmap =new HashMap<>();
        int result = 1;
        for (String[] clothe : clothes) {
            if (pmap.containsKey(clothe[1])) {
                pmap.replace(clothe[1], pmap.get(clothe[1]) + 1);
            } else {
                pmap.put(clothe[1], 1);
            }
        }

        List<Integer> kinds = new ArrayList<Integer>();
        for(Entry<String,Integer> elem: pmap.entrySet()){
            kinds.add(elem.getValue());
        }
        for(Integer kind : kinds){
            result *= (kind+1);
        }
        result -=1;


    }
}
