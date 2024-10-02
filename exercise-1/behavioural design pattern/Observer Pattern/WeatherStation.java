import java.util.List;
import java.util.ArrayList;

public class WeatherStation {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        
        Observer observer1 = new ConcreteObserver("Observer 1");
        Observer observer2 = new ConcreteObserver("Observer 2");

        weatherStation.addObserver(observer1);
        weatherStation.addObserver(observer2);

        // Simulate notifying observers
        weatherStation.notifyObservers();

        // Remove an observer and notify again
        weatherStation.removeObserver(observer1);
        weatherStation.notifyObservers();
    }
}
