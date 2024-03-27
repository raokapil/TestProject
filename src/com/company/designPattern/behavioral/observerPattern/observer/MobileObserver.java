package com.company.designPattern.behavioral.observerPattern.observer;

import com.company.designPattern.behavioral.observerPattern.observable.StockObservable;

public class MobileObserver implements NotificationAlertObserver{

    private StockObservable observable;
    private String userName;

    public MobileObserver(StockObservable observable, String userName) {
        this.observable = observable;
        this.userName = userName;
    }

    @Override
    public void update() {
        System.out.println("SMS sent with stock available " + observable.getStock());
    }
}
