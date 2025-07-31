package com.qa.untestable;

import java.time.LocalTime;

public class DataClerk {
    static public class FileLog implements IFileLog {
        public void clearTheLog() {
            // Simulated method that would do something to files in the log
        }
    }

    private final IFileLog theFileLog;
    private static final LocalTime STOP_TIME = LocalTime.of(20, 0);

    public DataClerk(IFileLog fl) {
        this.theFileLog = fl;
    }

    public LocalTime getTime() {
        return LocalTime.now();
    }


    public void processData() {
        if (getTime().isBefore(STOP_TIME)) {
            System.out.println("Ready to process the data");
            theFileLog.clearTheLog();
        }
    }
}