package com.emrys.core.platform.java;

import java.io.IOException;

public class MyAutoClosable implements AutoCloseable {

    public void saySomething() throws IOException
    {
//        System.out.println("Something");

        throw new IOException(" IOException at saySomething!");
    }

    @Override
    public void close() throws Exception {
//        System.out.println("close");
        throw new IOException("IOException at close!");
    }
}
