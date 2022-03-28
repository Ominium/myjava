import java.util.Scanner;

public class test2 {

    public static void main(String[] args) {

        int a = 20;
        Scanner scan = new Scanner(System.in);
        System.out.printf("a = %d\n", a);
        System.out.printf("바꿀 숫자를 입력해보세요 \n");
        a = scan.nextInt();
        System.out.printf("a = %d로 바꼈습니다.\n", a);


    }

}

