package com.company.designPattern.behavioral.commandPattern;

public class TurnACONCommand implements ICommand{

    private AirConditioner ac;
    public TurnACONCommand(AirConditioner ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.setTurnOnAC();
    }

    @Override
    public void undo() {
        ac.setTurnOffAC();
    }
}
