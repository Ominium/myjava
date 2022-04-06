import java.util.Scanner;

public class Ex05_09 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a;
        System.out.println("1~4중에 선택하세요");
        a = s.nextInt();
        switch (a) {
            case 1:
                System.out.println("1을 선택했다.\n");
                break;
            case 2:
                System.out.println("2을 선택했다.\n");
                break;
            case 3:
                System.out.println("3을 선택했다.\n");
                break;
            case 4:
                System.out.println("4을 선택했다.\n");
                break;
            default:
                System.out.println("이상한걸 선택했다.\n");
        }

    }
}
