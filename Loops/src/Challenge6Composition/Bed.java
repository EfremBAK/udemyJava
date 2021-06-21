package Challenge6Composition;

public class Bed {

    private String style;
    private int pillows;
    private double bedHeight;
    private int sheets;
    private int quilt;

    public Bed(String style, int pillows, double bedHeight, int sheets, int quilt) {
        this.style = style;
        this.pillows = pillows;
        this.bedHeight = bedHeight;
        this.sheets = sheets;
        this.quilt = quilt;
    }

    public String getStyle() {
        return style;
    }

    public int getPillows() {
        return pillows;
    }

    public double getBedHeight() {
        return bedHeight;
    }

    public int getSheets() {
        return sheets;
    }

    public int getQuilt() {
        return quilt;
    }

    public void make() {
        System.out.println("Bed -> making bed");
    }
}
