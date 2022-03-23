public class Ex04_15 {
    public static void main(String[] args) {
        int a = 100,result;
        for(int i=0; i<= 5;i++){
            result= a<<i;
            System.out.printf("%d << %d = %d \n",a ,i , result);
        }
        for(int i=0; i<= 5;i++){
            result= a>>i;
            System.out.printf("%d >> %d = %d \n",a ,i , result);
        }

    }
}
