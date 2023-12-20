package innerclass.anonymous;

import java.util.Arrays;
import java.util.Comparator;

@SuppressWarnings("ALL")
public class AnonymousInnerClassApp3 {

    public static void main(String[] args) {

        var numbers = Arrays.asList(3, 2, 1, 5, 4);

        // para ordenar essa lista da forma padrão poderíamos utilizar um método sort da interface Comparator, porém, ao invés de criar a classe para implementar, instanciar e chamar
        // o método, podemos reduzir a quantidade de códigos siplesmente utilizando as classes anônimas para isso

        Comparator<Integer> c = new Comparator<>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        numbers.sort(c);
        System.out.println(numbers);
    }
}
