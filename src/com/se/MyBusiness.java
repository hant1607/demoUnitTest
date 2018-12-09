package com.se;

public class MyBusiness {
    public String sayHello(boolean a, boolean b)
    {
        String s = "Hello";
        if(a & b)
        {
            s += " world";
        }
        return s;
    }
}
