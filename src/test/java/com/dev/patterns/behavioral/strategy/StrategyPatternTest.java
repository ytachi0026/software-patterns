package com.dev.patterns.behavioral.strategy;

import org.junit.Assert;

public class StrategyPatternTest {

    @org.junit.Test
    public void executeStrategyB() throws Exception {
        Context context = new Context(new StrategyMethodB());

        Assert.assertEquals("Strategy B", context.executeStrategy());
    }
}
