public class Car {
    String brand;
    int horsePower;
    boolean isAwd; // полноприводный?
    float acceleration; // разгон - за какое время в часах разогнался до 100 км автомобиль
    static int carsNumber; // статическое поле принадлежит классу целиком (не отдельному объекту)

    //конструктор по умолчанию
    public Car() {
        this("Toyota Supra", 387, false, 5.8f);
    }

    //конструктор с параметрами
    public Car(String brand, int horsePower, boolean isAwd, float acceleration) {
        this.brand = brand;
        this.horsePower = horsePower;
        this.isAwd = isAwd;
        this.acceleration = acceleration;
        carsNumber++;
    }

    void setAcceleration(float acceleration) {
        this.acceleration = acceleration;
    }

    void start (){
        System.out.println(brand + " makes Wrrrruuum!");
    }

    float countSpeed(float time) {
        return (100/acceleration)*time;
    }
}
