package com.examples.StepDefintions;


import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksDemo
{
    @Before("")
    public void hooks_mobile()
    {
        System.out.println("Before ....Hook");
    }

    @After("")
    public void hooks_after()
    {
        System.out.println("After Hook");
    }
}
