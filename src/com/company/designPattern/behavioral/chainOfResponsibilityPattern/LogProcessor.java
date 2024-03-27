package com.company.designPattern.behavioral.chainOfResponsibilityPattern;

public abstract class LogProcessor {

    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    private LogProcessor nextLogProcessor;

    public LogProcessor(LogProcessor nextLogProcessor) {
        this.nextLogProcessor = nextLogProcessor;
    }

    public void log (int logLevel, String logMessage) {

        if (this.nextLogProcessor != null) {
            this.nextLogProcessor.log(logLevel, logMessage);
        }
    }

}
