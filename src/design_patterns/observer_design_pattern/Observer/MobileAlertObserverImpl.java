package design_patterns.observer_design_pattern.Observer;

import design_patterns.observer_design_pattern.Observable.StocksObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver {
    String phoneNumber;
    StocksObservable observable;

    public MobileAlertObserverImpl(String phoneNumber, StocksObservable observable) {
        this.phoneNumber = phoneNumber;
        this.observable = observable;
    }
    @Override
    public void update() {
        sendMessageOnMobile(phoneNumber, "product is back in stock");
    }

    private void sendMessageOnMobile(String phoneNumber, String msg) {
        System.out.println("message sent to: " + phoneNumber);
    }
}
