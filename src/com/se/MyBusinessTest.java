package com.se;

import static org.junit.Assert.*;

public class MyBusinessTest {
    @org.junit.Test
    public void sayHelloTestCase001() throws Exception {
        MyBusiness mb = new MyBusiness();
        Boolean a = true;
        Boolean b = true;
        String s = mb.sayHello(a, b);
        assertEquals("Hello world", s);

    }

    @org.junit.Test
    public void sayHelloTestCase002() throws Exception {
        MyBusiness mb = new MyBusiness();
        Boolean a = true;
        Boolean b = false;
        String s = mb.sayHello(a, b);
        assertEquals("Hello", s);
    }

    @org.junit.Test
    public void sayHelloTestCase003() throws Exception {
        MyBusiness mb = new MyBusiness();
        Boolean a = false;
        Boolean b = true;
        String s = mb.sayHello(a, b);
        assertEquals("Hello", s);
    }

    @org.junit.Test
    public void sayHelloTestCase004() throws Exception {
        MyBusiness mb = new MyBusiness();
        Boolean a = false;
        Boolean b = false;
        String s = mb.sayHello(a, b);
        assertEquals("Hello", s);
        //System.out.println("OK");
    }

}