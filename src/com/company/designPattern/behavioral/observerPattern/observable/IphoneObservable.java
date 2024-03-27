package com.company.designPattern.behavioral.observerPattern.observable;

import com.company.designPattern.behavioral.observerPattern.observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservable implements StockObservable{

    List<NotificationAlertObserver> observerList = new ArrayList<>();

    int stockCount = 0;

    @Override
    public void add(NotificationAlertObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifySubscriber() {
        observerList.stream().forEach(o -> o.update());
    }

    @Override
    public void setStock(int stockCount) {
        if (this.stockCount == 0) {
            notifySubscriber();
        }

        this.stockCount += stockCount;
    }

    @Override
    public int getStock() {
        return stockCount;
    }


}
