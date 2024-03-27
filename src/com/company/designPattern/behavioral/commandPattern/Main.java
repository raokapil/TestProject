package com.company.designPattern.behavioral.commandPattern;

/**
 * Command is a behavioral design pattern that turns/encapsulate a request into a stand-alone object that
 * contains all information about the request. This transformation lets you pass requests as a method
 * arguments, delay or queue a request’s execution, and support undoable operations.
 *
 * pros :
 *
 *  Single Responsibility Principle : You can decouple classes that invoke operations from classes that
 *  perform these operations.
 *
 *  Open/Closed Principle : You can introduce new commands into the app without breaking existing client
 *  code.
 *
 *  You can implement undo/redo.
 */

// In command design pattern, we identify 4 things which are Invoker, command, receiver and client.

// Client
public class Main {

    public static void main(String[] args) {


        AirConditioner airConditioner = new AirConditioner();

        MyRemoteControl remoteControl = new MyRemoteControl();
        remoteControl.setCommand(new TurnACONCommand(airConditioner));

        remoteControl.pressButton();

        remoteControl.undo();
    }
}
