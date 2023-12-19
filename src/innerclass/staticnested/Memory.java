package innerclass.staticnested;

@SuppressWarnings("ALL")
public class Memory {

    // Exercício: criar classe Memory com método stats para retornar um Stats que contenha informações memória JVM, livre, ocupada, total
    // Stats deve ser uma nested class de Memory
    // Dica Objeto de Runtime possui essas informações
    private final Runtime runtime = Runtime.getRuntime();

    public Stats stats() {
        long free = runtime.freeMemory();
        long total = runtime.totalMemory();
        return new Stats(free, total - free, total);
    }

    public static class Stats {
        private final long free;
        private final long used;
        private final long total;

        public Stats(long free, long used, long total) {
            this.free = free;
            this.used = used;
            this.total = total;
        }

        public long getFree() {
            return free;
        }

        public long getUsed() {
            return used;
        }

        public long getTotal() {
            return total;
        }

        @Override
        public String toString() {
            return "Stats{" +
                    "free=" + free +
                    ", used=" + used +
                    ", total=" + total +
                    '}';
        }
    }
}
