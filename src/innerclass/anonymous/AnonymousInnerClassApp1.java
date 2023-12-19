package innerclass.anonymous;

@SuppressWarnings("ALL")
public class AnonymousInnerClassApp1 {

    public static void main(String[] args) {

// COMO É A IMPLEMENTAÇÃO DO MÉTODO DA INTERFACE... PRECISA DE UMA CLASSE PARA ISSO...
//        class HiMessage implements Message {
//
//            @Override
//            public String get() {
//                return "Hi!";
//            }
//        }
//        HiMessage message = new HiMessage();

        // Message message = new Message(); // isso é proibido no java, não é possível instanciar interfaces ou classes abstratas, a solução está a seguir
        Message message = new Message() { // abrir chaves aqui indica que estamos gerando uma classe anônima apenas para implementar o método get da interface
            // se abrir o arquivo compilado será observado que foi criado uma classe para implementar a interface, porém, no código fonte é anônima
            @Override
            public String get() {
                return "Hi!";
            }
        }; // e essa classe anonima não pode ser instanciada novamente, para isso deveria gerar outra classe anonima como a seguir

        Message message2 = new Message() {// importante destacar que aqui não estamos instanciando duas vezes a mesma classe, e sim criando duas classes novas
            // uma implementando get para exibir Hi! e outra que implementa o get para exibir Bye!
            @Override
            public String get() {
                return "Bye!";
            }
        };

        System.out.println(message.get());
        System.out.println(message2.get());
    }
}
