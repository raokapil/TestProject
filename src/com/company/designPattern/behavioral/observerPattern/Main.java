package com.company.designPattern.behavioral.observerPattern;

import com.company.designPattern.behavioral.observerPattern.observable.IphoneObservable;
import com.company.designPattern.behavioral.observerPattern.observable.StockObservable;
import com.company.designPattern.behavioral.observerPattern.observer.EmailObserver;
import com.company.designPattern.behavioral.observerPattern.observer.MobileObserver;
import com.company.designPattern.behavioral.observerPattern.observer.NotificationAlertObserver;

/**
 * Observer is a behavioral design pattern that lets you define a subscription mechanism to notify
 * multiple objects about any events that happen to the object they’re observing.
 */
// To implement cases like NotifyME.

// Observer is a behavioral design pattern. It specifies communication between objects:
// observable and observers. An observable is an object which notifies observers about the changes
// in its state.

// To be able to do that, the observable object needs to keep references to the observers.
public class Main {

    public static void main(String[] args) {

        StockObservable observable = new IphoneObservable();
        NotificationAlertObserver observer1 = new EmailObserver(observable, "xyz.com");
        NotificationAlertObserver observer2 = new EmailObserver(observable, "abc.com");
        NotificationAlertObserver observer3 = new MobileObserver(observable, "8800656990");

        observable.add(observer1);
        observable.add(observer2);
        observable.add(observer3);

        observable.setStock(100);
       // observable.notifySubscriber();
    }
}
