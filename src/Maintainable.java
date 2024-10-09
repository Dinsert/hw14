public interface Maintainable {

    default void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

}
