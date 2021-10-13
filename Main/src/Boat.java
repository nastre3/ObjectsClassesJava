public class Boat implements Swimmable, Rideable{
    @Override
    public void ride(int finalDistance) {
        this.swim();
    }
}
