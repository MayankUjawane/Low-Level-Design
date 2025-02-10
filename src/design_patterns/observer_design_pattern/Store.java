package design_patterns.observer_design_pattern;

import design_patterns.observer_design_pattern.Observable.IphoneObservableImpl;
import design_patterns.observer_design_pattern.Observable.StocksObservable;
import design_patterns.observer_design_pattern.Observer.EmailAlertObserverImpl;
import design_patterns.observer_design_pattern.Observer.MobileAlertObserverImpl;
import design_patterns.observer_design_pattern.Observer.NotificationAlertObserver;

public class Store {
    public static void main(String[] args) {
        StocksObservable iphoneStockObservable = new IphoneObservableImpl();

        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("abc@gmail.com", iphoneStockObservable);
        NotificationAlertObserver observer2 = new EmailAlertObserverImpl("xyz@gmail.com", iphoneStockObservable);
        NotificationAlertObserver observer3 = new MobileAlertObserverImpl("9876543210", iphoneStockObservable);

        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);
        iphoneStockObservable.add(observer3);

        iphoneStockObservable.setStockCount(10);
    }
}
