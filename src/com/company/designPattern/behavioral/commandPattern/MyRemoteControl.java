package com.company.designPattern.behavioral.commandPattern;

import java.util.Stack;

// Invoker
public class MyRemoteControl {

    Stack<ICommand> acCommandHistory = new Stack<>();
    ICommand command;

    public void setCommand(ICommand command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
        acCommandHistory.add(command);
    }

    public void undo() {
        if (!acCommandHistory.isEmpty()) {
            ICommand popCommand = acCommandHistory.pop();
            popCommand.undo();
        }
    }
}
