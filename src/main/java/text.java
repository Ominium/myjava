import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class text {

    public static void main(String[] args) {
        String answer = "";

        String[] ab = new String[]{ "Class","Fuck","ii"};
        int count;
        List<String> participant2 = new ArrayList<String>();
        participant2.add("Fuck");
        participant2.add("Class");
        participant2.add("Fuck");
        participant2.add("ii");

        for(int i=0; i<ab.length;i++) {
            for (int j = 0; j < participant2.size(); j++) {
                if (participant2.get(j) == ab[i]) {
                    participant2.remove(j);
                    break;
                }
            }
        }


        System.out.println(participant2.get(0));

    }
}
