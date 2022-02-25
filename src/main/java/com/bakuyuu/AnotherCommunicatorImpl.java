package com.bakuyuu;

/**
 * @author bakuyuu
 * @date 2022/2/25
 */
public class AnotherCommunicatorImpl implements Communicator{

    @Override
    public boolean sendMessage(String message) {
        System.out.println("another sending message: " + message);
        return true;
    }
}
