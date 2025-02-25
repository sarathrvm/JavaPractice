package ObserverDesignPatternForAmazonStocksNotification;

public interface StockObservable {

    void addObserver(NotificationAlertToObserver observer);
    void removeObserver(NotificationAlertToObserver observer);
    void notifyObserver();
    void setStockCount(int stockCount);
    int getStockCount();
}
