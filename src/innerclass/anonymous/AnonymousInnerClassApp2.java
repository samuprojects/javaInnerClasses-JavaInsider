package innerclass.anonymous;

public class AnonymousInnerClassApp2 {

    public static void main(String[] args) {

        Food f1 = new Food(); // instanciação normal de Food com implementação normal do eat
        f1.eat();

        // a seguir ao invés de apenas chamar o construtor abrimos as chaves para a criação de classe anônima com uma nova implementação para o método eat
        Food f2 = new Food() {
            @Override
            public void eat() {
                System.out.println("Eating fish!");
            }
        };
        f2.eat();
    }
}
