package innerclass.anonymous;

@SuppressWarnings("ALL")
public class ExRunnable {

    // Objetivo: criar método doIt() para receber Runnable e chamar run() em cenários diferentes para observar comportamento da execução
    public static void main(String[] args) {

        doIt(new Runnable() { // utilização de classe anonima para observar outras implementações em Runnable
            @Override
            public void run() {
                System.out.println("Hi!");
            }
        });

        doIt(new Runnable() {
            @Override
            public void run() {
                System.out.println(Math.random());
            }
        });
    }


    private static void doIt(Runnable runnable) { // método do exercício
        System.out.println("Running...");
        runnable.run();
    }
}