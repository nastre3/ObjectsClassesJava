import java.util.Objects;

public class Car extends Transport implements Rideable { // наследует от класса Transport, от интерфейса Rideable
    String brand;
    int horsePower;
    boolean isAwd; // полноприводный?
    float acceleration; // разгон - за какое время в часах разогнался до 100 км автомобиль
    static int carsNumber; // статическое поле принадлежит классу целиком (не отдельному объекту)
    int currentSpeed;
    Engine engine;

    //конструктор по умолчанию
    public Car() {
        this("Toyota Supra", 387, false, 5.8f);
    }

    @Override // если интерфейс не содержит реализацию метода
    public void ride(int finalDistance) {
        System.out.println("Ridding car");
    }

    //конструктор с параметрами
    public Car(String brand, int horsePower, boolean isAwd, float acceleration) {
        this.brand = brand;
        engine = new Engine(horsePower);
        //this.horsePower = horsePower;
        this.isAwd = isAwd;
        this.acceleration = acceleration;
        this.type = "Car";
        carsNumber++;
    }

    void setAcceleration(float acceleration) {
        this.acceleration = acceleration;
    }

    //Абстрактному методу не нужна реализация
    /*
    abstract void start (); /*{
        System.out.println(brand + " makes Wrrrruuum!");
    }
    */

    float countSpeed(float time) {
        return (100/acceleration)*time;
    }

    /*
    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // сравнение по ссылкам
        if (o == null || getClass() != o.getClass()) return false; // если классы объектов разные, то и объекты разные
        Car car = (Car) o; // приведение объекта к типу данных нашего класса
        // сравнение остальных полей
        return horsePower == car.horsePower && isAwd == car.isAwd && Float.compare(car.acceleration, acceleration) == 0 && Objects.equals(brand, car.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, horsePower, isAwd, acceleration);
    }

    @Override // переопределение метода, по умол наследуется от Object
    // toString как будет выглядить объект в строковом представлении
    // без переопределения: название_класса@хеш_объекта
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", horsePower=" + horsePower +
                ", isAwd=" + isAwd +
                ", acceleration=" + acceleration +
                '}';
    }
*/

    // Создание внутреннего класса
    class Engine {
        int horsePower;

        public Engine(int horsePower) {
            this.horsePower = horsePower;
        }
        void increaseSpeed() {
            currentSpeed += 20; // можно обращаться к полям Car
        }

        void setSpeed(int currentSpeed){
            Car.this.currentSpeed = currentSpeed;
        }
    }
}

