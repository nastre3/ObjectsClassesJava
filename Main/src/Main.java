import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Sedan sedan = new Sedan("qwe", 123, false, 12.2f);
        sedan.currentSpeed=33;
        Sedan sedan2 = new Sedan("qwe2", 123, false, 12.2f);
        sedan2.currentSpeed=44;
        Sedan sedan3 = new Sedan("qwe3", 123, false, 12.2f);
        sedan3.currentSpeed=22;

        // Пример внутреннего анонимного класса
        // Объект интерфейса Comparator, объясняющего как сравнивать седаны
        /*
        Comparator<Sedan> sedanComparator = new Comparator<Sedan>() { //анонимный класс - наследник Comparator, но без имени. У анонимного класса создается объект, к-ый помещяется в переменную.
            @Override // реализация метода интерфейса
            public int compare(Sedan o1, Sedan o2) { // сравнение по скорости
                return o1.currentSpeed - o2.currentSpeed; // возвращает положительное число,если 1ый>2го, иначе - отрицат. 0 при равенстве
            }
        };
         */

        // анонимный класс с использованием укорочения через лямбда
        Comparator<Sedan> sedanComparator = Comparator.comparingInt(o -> o.currentSpeed);

        //Treeset - структура данных с отсортированными по порядку данными, сравнивая 2 соседних определяется порядок для всех
        TreeSet<Sedan> cars = new TreeSet<>(sedanComparator); // передали объект анонимного класса в TreeSet
        cars.add(sedan);
        cars.add(sedan2);
        cars.add(sedan3);
        System.out.println(cars); // возвращает объекты, отсортированные по увеличению скорости

        Rideable rideable = finalDistance -> {
        };

        /*
        // Пример работы метода toString()
        Sedan sedan = new Sedan("qwe", 123, false, 12.2f);
        System.out.println(sedan);

        // Использование вложенного статического класса Luggage
        // связанного минимально с классом Sedan
        sedan.luggage.addItem("Food");
        sedan.luggage.addItem("Clothes");
        System.out.println(sedan.luggage.items);

        Sedan.Luggage luggage = new Sedan.Luggage();
        sedan.luggage=luggage; // изменение содержимого luggage
        System.out.println(sedan.luggage.items); // другой пустой багаж

        Sedan sedan2 = new Sedan("qwe", 123, false, 12.2f);
        System.out.println(sedan2.luggage.items);

         */

        //Пример работы внутреннего класса
        Car car = new Car();
        car.engine.setSpeed(12);
        // Car.Engine engine = new Car.Engine(12); - ошибка, тк Engine - неотъемлимая часть Car
        Car.Engine engine1 = new Car().new Engine(13); // Engine связывается с новым авто
        car.new Engine(1); // изменение двигателя у старого авто "car"

        //Пример полиморфизма
        //Rideable rideableCar = new Car();
        //Rideable rideableBoat = new Boat();
        //rideableCar.ride(100);
        //rideableBoat.ride(1000);

        /*
        Car supra = new Car(); // вызов конструктора для создания объекта класса Car
        supra.start();
        System.out.println(Car.carsNumber);

        Car lada = new Car("Lada", 90, false, 10.5f);
        System.out.println(Car.carsNumber);

        System.out.println(supra.countSpeed(5));
        System.out.println(lada.countSpeed(5));


        // Пример локального класса
        public static void someMethod() {
            class someClass {

            }
            new someClass();
        }*/
    }
}
