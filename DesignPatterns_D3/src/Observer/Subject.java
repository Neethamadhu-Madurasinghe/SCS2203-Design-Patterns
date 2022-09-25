package Observer;
import java.util.ArrayList;
public class Subject {
    private ArrayList<Observer> observers = new ArrayList<Observer>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        this.notifyAllObservers();
    }

    public void attach(Observer observer) {
        this.observers.add(observer);
    }

    private void notifyAllObservers() {
        for(Observer observer: observers) {
            observer.update();
        }
    }
}
