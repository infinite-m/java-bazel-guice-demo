package com.bakuyuu;

import com.google.inject.AbstractModule;

/**
 * @author bakuyuu
 * @date 2022/2/25
 */
public class TestModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(Communicator.class).annotatedWith(Default.class).to(DefaultCommunicatorImpl.class);
        bind(Communicator.class).annotatedWith(Another.class).to(AnotherCommunicatorImpl.class);
        bind(Communication.class).toInstance(new Communication(true));
    }
}
