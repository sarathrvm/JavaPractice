package ObserverDesignPattern;

import java.util.List;

public class ObservableImpl implements Observable{

    List<Observer> observerList;

    Observer observer;


    @Override
    public void addObserver(Observer obj) {
        observerList.add(obj);

    }

    @Override
    public void removeObserver(Observer obj) {
        observerList.remove(obj);

    }


    @Override
    public void notifyObservers() {
        for(Observer observer: observerList){
            observer.update();
        }

    }

    @Override
    public void setData(String data) {

    }

    @Override
    public String getData() {
        return "";
    }
}
