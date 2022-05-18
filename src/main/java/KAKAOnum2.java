public class KAKAOnum2 {
    public static void main(String[] args) {
        int[] lottos = {44,1,0,0,31,25};
        int[] win_nums = {31,10,45,1,6,19};
        int Maxrank = 7;
        int Minrank = 7;
        for(int a : lottos){
            for(int b : win_nums){
                if(a == 0){
                    Maxrank--;
                    break;
                }
                else if(a == b){
                    Maxrank--;
                    Minrank--;
                    break;
                }
            }
        }
        if(Maxrank >6){
            Maxrank = 6;
        }
        if(Minrank >6){
            Minrank = 6;
        }
        int[] answer = {Maxrank,Minrank};
        for(int a : answer){
            System.out.println(a);
        }
    }
}