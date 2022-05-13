import java.util.*;

public class codeup1004 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] nb = new int[n-1];

        for(int i=0; i<nb.length;i++){
            nb[i] =sc.nextInt();
        }
        Arrays.sort(nb,0,nb.length);

        for(int i=0; i<nb.length;i++){
            if(nb[i] != i+1){
                System.out.println("빠진 카드는 " + (i+1) + "입니다");
                break;
            }


        }


    }
}
