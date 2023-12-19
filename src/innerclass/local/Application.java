package innerclass.local;

public class Application {

    public void greet() {

        class Greeter { // local inner class é caracterizada por estar dentro de um método, e na prática ela só existe dentro dele
            public void sayHi() {
                System.out.println("Hi!");
            }
        }

        Greeter greeter = new Greeter(); // dentro do método instanciamos a classe para que tenha efeito na chamada do main
        greeter.sayHi();
    } // pode ser utilizado em cenários bem específicos, por exemplo, criar uma classe que implementa uma interface específica da aplicação, entre outros bem específicos
}
