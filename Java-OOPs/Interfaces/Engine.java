public interface Engine {

    // the modifiers here are blurred because variables are by default static and final, so we don't need to specify them explicitly
    static final int PRICE = 50000;

    // same case with abstract
    public abstract  void start();
    void stop();
    void acc();

}
