package ObserverDesignPattern;



public interface Observable {


    void addObserver(Observer obj);
    void removeObserver(Observer obj);
    void notifyObservers();
    void setData(String data);
    String getData();
}
