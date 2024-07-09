package codes.properties.inheritance;

public class Main {
    public static void main(String[] args) {
        Box cube = new Box(5);
        cube.calculate();

        WeightedBox wbox = new WeightedBox(2,4,3,25);
        wbox.calculate();
        wbox.calculateWeighted();
    }
}
