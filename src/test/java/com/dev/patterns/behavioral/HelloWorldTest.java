package com.dev.patterns.behavioral;

import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;
import org.junit.Assert;
import org.junit.Test;

import java.io.PrintStream;

public class HelloWorldTest {

    @org.junit.Test
    public void name() throws Exception {
        ByteOutputStream out = new ByteOutputStream();
        HelloWorld.print(new PrintStream(out));
        String s = out.toString();
        Assert.assertEquals("Hello World", s);
    }

    @Test
    public void testSumWrapper() {
        Integer a = new Integer(1);
        int b =3 ;

        System.out.println(a + b);
    }
}
