import Observable.IphoneObservable;
import Observable.SamsungObservable;
import Observable.StocksObservable;
import Observer.EmailAlertObserver;
import Observer.MobileAlertObserver;
import Observer.NotificationAlertObserver;

public class Store {

    public static void main(String[] args) {

        StocksObservable iphoneStockObservable = new IphoneObservable();
        StocksObservable samsungStockObservable = new SamsungObservable();
        NotificationAlertObserver observer1 = new EmailAlertObserver("rohitbhagatkar940@gmail.com", iphoneStockObservable);
        NotificationAlertObserver observer2 = new EmailAlertObserver("np24437@bristol.ac.uk", iphoneStockObservable);
        NotificationAlertObserver observer3 = new MobileAlertObserver("Assassin", iphoneStockObservable);
        NotificationAlertObserver observer4 = new EmailAlertObserver("rohitbhagatkar940@outlook.com",samsungStockObservable );

        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);
        iphoneStockObservable.add(observer3);
        samsungStockObservable.add(observer4);
        samsungStockObservable.setStockCount(1);
        iphoneStockObservable.setStockCount(10);
    }
}