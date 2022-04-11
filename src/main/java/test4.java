import java.util.Scanner;
public class test4 {
    public static void main(String[] args){
        int a = 0;
        Scanner scanner;
        scanner = new Scanner(System.in);
        a = scanner.nextInt();

        for(int i=0; i<=a; i++){
            for(int j= i; a-j >0; j++){
                System.out.printf(" ");
            }
            for(int j= 0; j<i; j++){
                System.out.printf("*");

            }
            System.out.println("");
        }


    }
}
