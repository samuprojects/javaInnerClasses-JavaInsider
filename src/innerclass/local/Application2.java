package innerclass.local;

public class Application2 {
    private final String message = "Hi";

    public void greet(String name) {

        int x = 10;

        class Greeter {
            public void sayHi() {

                System.out.format("%s, %s! %d", message, name, x); // as inner classes do tipo local podem acessar atributos, parametros ou outras variáveis locais da outer class
                // as variáveis locais que podem ser acessadas nesse cenários devem ser explicitamente ou implicitamente final
                // se alterar qualquer uma das variáveis que não explicitamente definidas como final o código deixará de compilar
            }
        }

        Greeter greeter = new Greeter();
        greeter.sayHi();
    }
}
