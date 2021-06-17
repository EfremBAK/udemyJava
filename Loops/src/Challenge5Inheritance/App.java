package Challenge5Inheritance;

public class App {
    public static void main(String[] args) {


        Tesla myTesla = new Tesla(36);
        myTesla.accelerate(30);
        myTesla.steer(45);
        myTesla.accelerate(20);
        myTesla.accelerate(-42);
    }
}
