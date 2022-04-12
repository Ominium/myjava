import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        int a = 0;
        int count = 0;
        Scanner scanner;
        scanner = new Scanner(System.in);
        a = scanner.nextInt();
        for (int i = 1; i <= a; i=i+2) {

            for(int j = a/2; j-count>0; j--){
                System.out.printf(" ");
            }
            for(int j = 0; j<i; j++){
                System.out.printf("*");
            }
            for(int j = a/2; j-count>0; j--){
                System.out.printf(" ");
            }
            count++;
            System.out.printf("\n");
        }
        count = a/2 - 1;

        for (int i = a -2; i >= 1; i=i-2) {

            for(int j = a/2; j-count>0; j--){
                System.out.printf(" ");
            }
            for(int j = 0; j<i; j++){
                System.out.printf("*");
            }
            for(int j = a/2; j- count>0; j--){
                System.out.printf(" ");
            }
            count--;
            System.out.printf("\n");
        }

    }
}
