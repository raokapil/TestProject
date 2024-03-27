package com.company.designPattern.behavioral.commandPattern;

public class TurnACOffCommand implements ICommand{

    private AirConditioner ac;
    public TurnACOffCommand(AirConditioner ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.setTurnOffAC();
    }

    @Override
    public void undo() {
        ac.setTurnOnAC();
    }
}

