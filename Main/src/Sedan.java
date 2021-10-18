import java.util.ArrayList;
import java.util.List;

public class Sedan extends Car { //наследоваться можно только от 1го класса
    public Luggage luggage = new Luggage();

    public Sedan(String brand, int horsePower, boolean isAwd, float acceleration) {
        super(brand, horsePower, isAwd, acceleration); // super - ключевое слово для обращения к классу-предку
    }

    @Override
    void start() {
        System.out.println("Started Sedan");
    }

    // Статический вложенный класс
    static class Luggage {
        List items = new ArrayList();
        public void addItem(Object item) {
            items.add(item);
        }
        public Object getObject(int i) {
            return items.get(i);
        }

    }
}
