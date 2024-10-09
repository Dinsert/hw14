public class Truck extends Vehicles implements Maintainable {

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
}
