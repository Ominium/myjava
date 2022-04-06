import java.util.Scanner;

public class Ex05_09_02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a;
        System.out.printf("1~4중에 선택하세요");
        a = s.nextInt();
        if (a == 1) {
            System.out.printf("1을 선택했다");
        } else if (a == 2) {
            System.out.printf("2을 선택했다");
        } else if (a == 3) {
            System.out.printf("3을 선택했다");
        } else if (a == 4) {
            System.out.printf("4을 선택했다");
        } else {
            System.out.printf("이상한걸 선택했다");
        }

    }
}
