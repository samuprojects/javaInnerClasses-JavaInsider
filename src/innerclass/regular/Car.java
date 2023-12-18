package innerclass.regular;

@SuppressWarnings("ALL")
public class Car {

    private int speed;
    private Engine engine = new Engine();
    private boolean on;

    public void accelerate() {
        engine.injectFuel();
    }

    public int getSpeed() {
        return speed;
    }

    private class Engine { // o Java permite deixar a classe pública, porém, o objetivo da inner class é justamente manter encapsulada
        private boolean on;
        public void injectFuel() {
            speed += 10;
        }

        public boolean isALLOn() {
            return this.on && Car.this.on; // referência da outer class
        }
    }

    public class Door {
        private boolean isOpen;

        public void open() {
            isOpen = true;
        }

        public void close() {
            isOpen = false;
        }
    }
}
