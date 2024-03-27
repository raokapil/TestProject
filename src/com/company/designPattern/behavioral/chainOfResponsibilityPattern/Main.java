package com.company.designPattern.behavioral.chainOfResponsibilityPattern;

/**
 * Chain of Responsibility is a behavioral design pattern that lets you pass requests along a chain of
 * handlers. Upon receiving a request, each handler decides either to process the request or to pass it
 * to the next handler in the chain.
 *
 * Pros :
 *
 *  You can control the order of request handling.
 *
 *  Single Responsibility Principle. You can decouple classes that invoke operations from classes that
 *  perform operations.
 *
 *  Open/Closed Principle. You can introduce new handlers into the app without breaking the existing
 *  client code.
 */
// When a sender doesn't care about who is going to response it back for its request, just need a request
// result from any of the receiver.

// Application usage : ATM / Vending Machine / Design Logger
public class Main {

    public static void main (String[] args) {

        LogProcessor logProcessor = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));

        logProcessor.log(LogProcessor.ERROR, "exception happens");
        logProcessor.log(LogProcessor.DEBUG, "need to debug this");
        logProcessor.log(LogProcessor.INFO, "just for info");
    }
}
