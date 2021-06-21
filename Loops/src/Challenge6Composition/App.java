package Challenge6Composition;

public class App {
    public static void main(String[] args) {

        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("North");
        Ceiling ceiling = new Ceiling(2.5, "white");
        Bed bed = new Bed("King", 4, .7, 3, 2);
        Lamp lamp = new Lamp("classic", false, 75);

        Bedroom bedRoom = new Bedroom("Efrem's room", wall1, wall2, wall3, wall4, ceiling, bed, lamp);

        bedRoom.makeBed();
        bedRoom.getLamp().turnOn();

    }
}
