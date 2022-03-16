public class Ex03_12 {
    public static void main(String[] args) {
       int a,b;
       char c,d;
       a= 0xF90A;
       b = 0x50;
        System.out.printf("%c\n",(char)a);
        c = (char) b;
        System.out.printf("%c\n",c);
        d = '#';
        System.out.printf("%c의 ASCII값은 %d 입니다.\n",d,(int)d);
    }
}
