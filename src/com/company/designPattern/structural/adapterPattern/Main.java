package com.company.designPattern.structural.adapterPattern;

/**
 * Adapter is a structural design pattern that allows objects with incompatible interfaces
 * to collaborate.
 *
 * Pros :
 *  Single Responsibility Principle. You can separate the interface or data conversion code from the
 *  primary business logic of the program.
 *
 *  Open/Closed Principle. You can introduce new types of adapters into the program without breaking
 *  the existing client code, as long as they work with the adapters through the client interface.
 */
// Adapter is used to bridge a gap between expected interface and existing interface.
// For example : a socket extension to connect oval pin power cord to square shape socket extension.

// It'll help to handle, How to take care of use cases where you're getting a request or response which is
//  diff from what you wanted.

import com.company.designPattern.structural.adapterPattern.adaptee.WeightMachineForBabies;
import com.company.designPattern.structural.adapterPattern.adapter.WeightMachineAdapter;
import com.company.designPattern.structural.adapterPattern.adapter.WeightMachineAdapterImpl;


public class Main {

    public static void main (String[] args) {

        WeightMachineAdapter weightMachineAdapter = new WeightMachineAdapterImpl(new WeightMachineForBabies());
        System.out.println(weightMachineAdapter.getWeightInKilos());

    }
}
