package com.company.designPattern.behavioral.observerPattern.observable;

import com.company.designPattern.behavioral.observerPattern.observer.NotificationAlertObserver;

public interface StockObservable {

    void add(NotificationAlertObserver observer);

    void remove(NotificationAlertObserver observer);

    void notifySubscriber();

    void setStock(int stockCount);

    int getStock();
}
