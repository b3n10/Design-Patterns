public class RubberDuck implements Quackable {
    private Observable observable;

    public RubberDuck() {
        observable = new Observable(this);
    }

    public void quack() {
        System.out.println("I'm quacking as a Rubber!");
        notifyObservers();
    }

    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    public void notifyObservers() {
        observable.notifyObservers();
    }

    @Override
    public String toString() {
        return "RubberDuck";
    }
}
