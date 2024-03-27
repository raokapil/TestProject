package com.company.designPattern.behavioral.chainOfResponsibilityPattern;

public class InfoLogProcessor extends LogProcessor{

    public InfoLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    public void log (int logLevel, String logMessage) {

        if (logLevel == INFO) {
            System.out.println("INFO : " + logLevel);
        } else {
         super.log(logLevel, logMessage);
        }
    }
}
