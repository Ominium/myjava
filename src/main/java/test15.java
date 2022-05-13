import java.util.ArrayList;
import java.util.List;

public class test15 {

    public String solution(String[] participant, String[] completion) {
        String answer = "";
        int count;
        List<String> participant2 = new ArrayList<String>();
        for(int i = 0; i<participant.length; i++){
            participant2.add(participant[i]);
        }
        for(int i= 0; i<completion.length; i++){

            for(int j = 0; j<participant2.size(); j++){
                if(completion[i] == participant2.get(j)){
                    participant2.remove(j);
                    break;
                }
            }

        }
        answer = participant2.get(0);
        return answer;
    }
}