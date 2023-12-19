package innerclass.staticnested;

import innerclass.staticnested.Memory.Stats;

public class ExMemory {

    public static void main(String[] args) {

        Memory m = new Memory();
        Stats stats = m.stats();
        System.out.println(stats);

    }
}
