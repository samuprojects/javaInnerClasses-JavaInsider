package innerclass.staticnested;

@SuppressWarnings("ALL")
public class Operation {
    private static int initialValue = 10;

    private final int value1;
    private final int value2;
    private final Counter counter = new Counter();

    public Operation(int value1, int value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public int sum() {
        counter.increment();
        return value1 + value2;
    }

    public Counter getCounter() {
        return counter;
    }

    private static int getInitialValue() {
        return initialValue;
    }

    public static class Counter { // a static nested é caracterizada por não ter uma relação com a outer class, poderia inclusive estar em um arquivo separado, mas é incluída por conveniência
        private int value = getInitialValue(); // pode acessar atributos ou métodos estáticos da outer class

        public void increment() {
            value++;
        }

        public int getValue() {
            return value;
        }
    }
}
