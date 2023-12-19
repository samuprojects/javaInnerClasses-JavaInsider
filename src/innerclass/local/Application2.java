package innerclass.local;

public class Application2 {
    private final String message = "Hi";

    public void greet(String name) {
        String upperName = name.toUpperCase();
        // a visualização de variáveis que não foram alteradas ocorre porque se observar o arquivo compilado class essas inner classes são transformadas em
        // top levels classes (que são as salvas em arquivo exclusivo .java) para uso pela JVM, se alterar essas variáveis há inconsistência, por isso essa obrigatoriedade.

        class Greeter {
            public void sayHi() {

                System.out.format("%s, %s!", message, upperName ); // as inner classes do tipo local podem acessar atributos, parametros ou outras variáveis locais da outer class
                // as variáveis locais que podem ser acessadas nesse cenários devem ser explicitamente ou implicitamente final
                // se alterar qualquer uma das variáveis que não explicitamente definidas como final o código deixará de compilar
            }
        }

        Greeter greeter = new Greeter();
        greeter.sayHi();
    }
}
