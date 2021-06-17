package Challenge5Inheritance;

public class Tesla extends Car{
    private int roadServiceMonth;

    public Tesla(int roadServiceMonth) {
        super("Tesla", "Electric", 4, 2, 6, false);
        this.roadServiceMonth = roadServiceMonth;
    }
}
