public interface Rideable {
    int DISTANCE = 123; // final, static const

    void ride(int finalDistance); // без реализации метода, требуется переопределять в классе, наследующем интерфейс через ctrl+o

    /* C реализацией метода
    default void ride(int finalDistance) { // все методы в интерфейсе по умолчанию - публичные
        // модификатор default - для реализации методов в интерфейсе
        System.out.println("Ridding till " + finalDistance);
    }*/

}
