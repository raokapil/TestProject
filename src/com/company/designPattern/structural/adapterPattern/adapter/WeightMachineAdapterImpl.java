package com.company.designPattern.structural.adapterPattern.adapter;

import com.company.designPattern.structural.adapterPattern.adaptee.WeightMachine;

public class WeightMachineAdapterImpl implements WeightMachineAdapter{

    private WeightMachine weightMachine;

    public WeightMachineAdapterImpl(WeightMachine weightMachine) {
        this.weightMachine = weightMachine;
    }

    @Override
    public double getWeightInKilos() {

        double weightInPound = weightMachine.getWeightInPounds();

        double weightInKilo = weightInPound * 0.45;

        return weightInKilo;
    }
}
