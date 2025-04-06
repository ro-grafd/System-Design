import Observable.IphoneObservable;
import Observable.StocksObservable;
import Observer.EmailAlertObserver;
import Observer.MobileAlertObserver;
import Observer.NotificationAlertObserver;

public class Store {

    public static void main(String[] args) {

        StocksObservable iphoneStockObservable = new IphoneObservable();

        NotificationAlertObserver observer1 = new EmailAlertObserver("rohitbhagatkar940@gmail.com", iphoneStockObservable);
        NotificationAlertObserver observer2 = new EmailAlertObserver("np24437@bristol.ac.uk", iphoneStockObservable);
        NotificationAlertObserver observer3 = new MobileAlertObserver("Assassin", iphoneStockObservable);

        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);
        iphoneStockObservable.add(observer3);

        iphoneStockObservable.setStockCount(10);
    }
}