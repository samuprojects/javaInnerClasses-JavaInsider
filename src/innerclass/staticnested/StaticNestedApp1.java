package innerclass.staticnested;

public class StaticNestedApp1 {

    public static void main(String[] args) {

        Operation op = new Operation(5, 7);
        int result = op.sum();
        op.sum();
        System.out.println(result);

        Operation.Counter counter = op.getCounter(); // a forma de referenciar a static nested é a mesma da regular inner class
        System.out.println(counter.getValue());
    }
}
