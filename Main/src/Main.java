public class Main {
    public static void main(String[] args) {

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
        */
    }
}
