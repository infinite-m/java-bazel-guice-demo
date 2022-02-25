package com.bakuyuu;

/**
 * @author bakuyuu
 * @date 2022/2/25
 */
public class DefaultCommunicatorImpl implements Communicator {

    @Override
    public boolean sendMessage(String message) {
        System.out.println("default sending message: " + message);
        return true;
    }
}
