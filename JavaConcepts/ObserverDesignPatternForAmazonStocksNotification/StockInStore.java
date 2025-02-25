package ObserverDesignPatternForAmazonStocksNotification;

import java.util.ArrayList;
import java.util.List;

public class StockInStore {

    public static void main(String[] args) {

        StockObservable observable= new StockObservableImpl();
        NotificationAlertToObserver observer1 = new emailNotificationImpl("sarathrvm@gmail.com",observable);
        NotificationAlertToObserver observer2 = new MobileNotificationAlertImpl("sarath@gmail.com",observable);

        observable.addObserver(observer1);
        observable.addObserver(observer2);

        observable.setStockCount(0);

    }
}
