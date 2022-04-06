import java.util.Scanner;
public class Ex05_06 {
    public static void main(String[] args) {
        boolean retry= false;



        Scanner scanner;
        scanner = new Scanner(System.in);
        String b;
        int a =0;
        System.out.printf("게임을 시작하시겠습니까?\n");
        b = scanner.nextLine();
        if(b =="네"||b == "yes"){
            retry = true;
        }
        else  retry =false;
        while(retry){
            System.out.printf("숫자를 입력하세요\n");
            a = scanner.nextInt();
            if(a !=0){
                if(a % 2 == 0){
                    System.out.printf("%d는 짝수입니다.\n",a);
                }
                else System.out.printf("%d는 홀수입니다.\n",a);
            }
            else System.out.printf("%d는 0입니다.\n",a);

            System.out.printf("게임을 다시 시작하시겠습니까?\n");
            b = scanner.nextLine();
            if(b =="네"||b == "yes"){
                retry = true;
            }
            else  retry =false;
        }

    }
}
