public class StrategyPatternExample {
    public static void main(String [] args) {
        Simulation sim = new Simulation(new ConsoleWriter());
        sim.getRandom();
    }
}

class Simulation {
    private Writer writer;

    public Simulation(Writer writer) {
        this.writer = writer;
    }

    public void getRandom() {
        for (int i = 0; i < 10; i++) {
            writer.write((Math.random() > 0.5) ? "heads" : "tails");
        }
    }
}

interface Writer {
    void write(String string);
}

class ConsoleWriter implements Writer {
    public void write(String string) {
        System.out.println(string);
    }
}
