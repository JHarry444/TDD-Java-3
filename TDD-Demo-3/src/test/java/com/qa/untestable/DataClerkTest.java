package com.qa.untestable;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.time.LocalTime;

class DataClerkTest {
    @Test
    void testProcessData() {
        // arrange
        DataClerk.FileLog fl = new DataClerk.FileLog();
        DataClerk cut = new DataClerk(fl);

        // act
        cut.processData();

        // assert
        // There is no way of knowing if this ran as expected
    }

    @Test
    void testLogBeforeStopTime() {
        // arrange
        IFileLog log = Mockito.mock(IFileLog.class);
        DataClerk cutSpy = Mockito.spy(new DataClerk(log));

        Mockito.doReturn(LocalTime.of(12, 0)).when(cutSpy).getTime();

        // act
        cutSpy.processData();

        // assert
        Mockito.verify(log, Mockito.times(1)).clearTheLog();
    }

    @Test
    void testLogAfterStopTime() {
        // arrange
        IFileLog log = Mockito.mock(IFileLog.class);
        DataClerk cutSpy = Mockito.spy(new DataClerk(log));

        Mockito.doReturn(LocalTime.of(21, 0)).when(cutSpy).getTime();

        // act
        cutSpy.processData();

        // assert
        Mockito.verify(log, Mockito.times(0)).clearTheLog();
    }

}
