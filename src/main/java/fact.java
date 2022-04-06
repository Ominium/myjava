import java.util.Scanner;

public class fact {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a;
        int b =0;
        a = s.nextInt();
        b= 1;
        for(int i=a; i>0; i-- ){
            b *= i;


        }
        System.out.printf("%d\n",b);
    }
}
