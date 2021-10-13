public interface Swimmable {
    // C реализацией метода
    default void swim() { // все методы в интерфейсе по умолчанию - публичные
        // модификатор default - для реализации методов в интерфейсе
        System.out.println("Swimming");
    }
}
