import java.util.Scanner;

public class test3 {

    public static void main(String[] args) {
        int a = 0;
        boolean retry= false;

        int b = 0;
        Scanner scanner;
        scanner =new Scanner(System.in);
        System.out.printf("게임을 시작하시겠습니까? 1.네 2.아니오\n");
        b = scanner.nextInt();

        if((b==1)){
            retry = true;
        }

        while (retry){
            System.out.println("a의 수를 입력해주세요");
            a = scanner.nextInt();
            if (a % 3 == 0 && a % 5 == 0) {
                System.out.println("a는 3과 5의 배수입니다.");
            } else if (a % 3 == 0) {
                System.out.println("a는 3의 배수입니다.");
            } else if (a % 5 == 0) {
                System.out.println("a는 5의 배수입니다.");
            } else System.out.println("a는 3과 5 어느쪽의 배수도 아닙니다.");

            System.out.printf("게임을 다시 시작하시겠습니까? 1.네 2.아니오\n");
            b = scanner.nextInt();
            if(b == 1){
                retry = true;
            }
            else  retry =false;
        }

    }
}
