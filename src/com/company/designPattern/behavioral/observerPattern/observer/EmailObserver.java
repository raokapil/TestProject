package com.company.designPattern.behavioral.observerPattern.observer;

import com.company.designPattern.behavioral.observerPattern.observable.StockObservable;

public class EmailObserver implements NotificationAlertObserver{

    private StockObservable observable;
    private String emailId;

    public EmailObserver(StockObservable observable, String emailId) {
        this.observable = observable;
        this.emailId = emailId;
    }

    @Override
    public void update() {
        System.out.println("Email sent with available stock " + observable.getStock());
    }
}
