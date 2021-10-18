public class Main {
    public static void main(String[] args) {

        // Пример работы метода toString()
        Sedan sedan = new Sedan("qwe", 123, false, 12.2f);
        System.out.println(sedan);

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
