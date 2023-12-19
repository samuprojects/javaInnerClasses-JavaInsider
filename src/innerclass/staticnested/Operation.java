package innerclass.staticnested;

public class Operation {

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

    public static class Counter { // a static nested é caracterizada por não ter uma relação com a outer class, poderia inclusive estar em um arquivo separado, mas é incluída por conveniência
        private int value;

        public void increment() {
            value++;
        }

        public int getValue() {
            return value;
        }
    }
}
