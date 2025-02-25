package ObserverDesignPatternForAmazonStocksNotification;

public class MobileNotificationAlertImpl implements NotificationAlertToObserver{

    public String emailId;
    StockObservable stockObservable;

    public MobileNotificationAlertImpl(String emailId,StockObservable observable){
        this.emailId = emailId;
        this.stockObservable=observable;

    }
    @Override
    public void updateStock() {
        sendEmail(emailId);
    }

    public void sendEmail(String emailId){
        System.out.println("product is in stock Mobile Notification Alert to email id: "+emailId);
    }


}
