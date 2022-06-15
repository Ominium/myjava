import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
class Car {
    private String name;
    private int speed;
    public Car(String a,int b){
        name = a;
        speed = b;
    }
    public void Upspeed(int upspeed){
        speed = speed + upspeed;
    }
    public void Printcar(){
        System.out.println("차 이름 : "+name + "차 속도 :"+speed);
    }
}
class Truck extends Car{
    public Truck(String a, int b) {
        super(a, b);
    }
    @Override
    public void Printcar(){
        super.Printcar();
    }

    @Override
    public void Upspeed(int upspeed) {
        super.Upspeed(upspeed / 2);
    }
}
public class Ex12_01_test{
    public static void main(String[] args) {
        Car car1 = new Car("벤츠 s 클래스", 50);
        Car car2 = new Truck("봉고", 50);
        car1.Printcar();
        car2.Printcar();
        car1.Upspeed(50);
        car2.Upspeed(50);
        car1.Printcar();
        car2.Printcar();
    }



}