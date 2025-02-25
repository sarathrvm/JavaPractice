package ObserverDesignPatternForAmazonStocksNotification;

public class emailNotificationImpl implements NotificationAlertToObserver {
    public String emailId;
    StockObservable stockObservable;

    public emailNotificationImpl(String emailId,StockObservable stockObservable){
        this.emailId=emailId;
        this.stockObservable=stockObservable;
    }


    @Override
    public void updateStock() {
        sendEmail(emailId);

    }

    public void sendEmail(String emailId){
        System.out.println("stock is available. hurry up!! to: "+emailId);
    }
}
