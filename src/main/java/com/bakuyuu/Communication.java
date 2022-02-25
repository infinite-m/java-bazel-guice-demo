package com.bakuyuu;

import com.google.inject.BindingAnnotation;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;

/**
 * @author bakuyuu
 * @date 2022/2/25
 */
public class Communication {

    @Inject
    @Default
    private Communicator communicator;

    @Inject
    @Another
    private Communicator anotherCommunicator;

    public Communication(boolean keepRecords) {
        if (keepRecords) {
            System.out.println("Message logging enabled");
        }
    }

    public boolean sendMessage(String message) {
        communicator.sendMessage(message);
        anotherCommunicator.sendMessage(message);
        return true;
    }

    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new TestModule());
        Communication communication = injector.getInstance(Communication.class);
        communication.sendMessage("hello world");
    }
}
