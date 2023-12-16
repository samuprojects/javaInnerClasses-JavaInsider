package innerclass.regular;

@SuppressWarnings("ALL")
public class Car {

    private int speed;
    private Engine engine = new Engine();

    public void accelerate() {
        engine.injectFuel();
    }

    public int getSpeed() {
        return speed;
    }

    private class Engine { // o Java permite deixar a classe pública, porém, o objetivo da inner class é justamente manter encapsulada
        public void injectFuel() {
            speed += 10;
        }
    }
}
