package ObserverDesignPatternForAmazonStocksNotification;

import java.util.ArrayList;
import java.util.List;

public class StockObservableImpl implements StockObservable{

    List<NotificationAlertToObserver> observerList=new ArrayList<>();
    private int stockCount=0;
    @Override
    public void addObserver(NotificationAlertToObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(NotificationAlertToObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObserver() {
      for(NotificationAlertToObserver observer: observerList){
          observer.updateStock();
      }

    }

    @Override
    public void setStockCount(int newStockAddedCount) {
        if(stockCount==0){
            notifyObserver();
        }
        stockCount=stockCount+newStockAddedCount;
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}
