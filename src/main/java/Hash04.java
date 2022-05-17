import java.util.*;
import java.util.Map.Entry;
public class Hash04 {
    public static void main(String[] args) {

        int[] plays = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        String[] genres = {"classic", "pop", "pop", "classic", "classic", "pop", "R&B", "ballad", "R&B", "pop"};
        HashMap<String, Integer> map = new HashMap<>();
        HashMap<String, Integer> omap = new HashMap<>();
        HashMap<String, Integer> omap2 = new HashMap<>();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < plays.length; i++) {
            if (map.containsKey(genres[i])) {
                map.replace(genres[i], map.get(genres[i]) + plays[i]);
            } else map.put(genres[i], plays[i]);
        }
        for (int i = 0; i < plays.length; i++) {
            if (omap.containsKey(genres[i])) {
                if (omap.get(genres[i]) < plays[i]) {
                    omap2.put(genres[i], omap.get(genres[i]));
                    omap.put(genres[i], plays[i]);
                } else if (omap2.containsKey(genres[i])) {
                    if (omap2.get(genres[i]) < plays[i]) {
                        omap2.put(genres[i], plays[i]);
                    }
                } else omap2.put(genres[i], plays[i]);
            } else omap.put(genres[i], plays[i]);
        }
        for (Entry<String, Integer> enpm : map.entrySet()) {
            list.add(enpm.getKey());
        }
        String[] bestlist = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            bestlist[i] = list.get(i);
        }
        for (int i = 0; i < bestlist.length; i++) {
            for (int j = 0; j < bestlist.length; j++) {
                if (map.get(bestlist[i]) > map.get(bestlist[j])) {
                    String b;
                    b = bestlist[i];
                    bestlist[i] = bestlist[j];
                    bestlist[j] = b;
                }
            }
        }
        List<Integer> anwserlist = new ArrayList<>();
        int a = 0;
        for (String s : bestlist) {

            for (int j = 0; j < plays.length; j++) {
                if (omap.get(s) != null) {
                    if (plays[j] == omap.get(s) && genres[j].equals(s)) {
                        anwserlist.add(j);
                        a = j;
                        break;
                    }
                }

            }

            for (int j = 0; j < plays.length; j++) {
                if (omap2.get(s) != null) {
                    if (plays[j] == omap2.get(s) && genres[j].equals(s)&& a != j) {

                        anwserlist.add(j);
                        break;
                    }

                }

            }
        }
            int[] anwser = new int[anwserlist.size()];
            for (int i = 0; i < anwser.length; i++) {
                anwser[i] = anwserlist.get(i);
            }
            for (int b : anwser) {
                System.out.println(b);
            }



    }
}
