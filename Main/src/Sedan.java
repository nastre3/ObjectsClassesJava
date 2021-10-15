public class Sedan extends Car { //наследоваться можно только от 1го класса

    public Sedan(String brand, int horsePower, boolean isAwd, float acceleration) {
        super(brand, horsePower, isAwd, acceleration); // super - ключевое слово для обращения к классу-предку
    }

    @Override
    void start() {
        System.out.println("Started Sedan");
    }
}
