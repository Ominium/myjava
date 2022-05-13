import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        num = scanner.nextInt();
        boolean three = true;
        for(int i= num; i <= 1; i=i/3){
            if(num % 3 != 0){
                System.out.printf("입력 실패");
                three = false;
            }
        }
        if(three){
            for(int i= 0; i <num; i++){
                for(int j = 0; j<num; j++){
                    if(j == 0 || j == num -1|| i == 0 || i == num -1) {
                        System.out.printf("*");


                    }
                    else System.out.printf(" ");
                }
                System.out.printf("\n");
            }






        }



    }
}