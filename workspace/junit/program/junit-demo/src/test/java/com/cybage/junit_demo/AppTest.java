package com.cybage.junit_demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;


public class AppTest 
{
    @Tag("DEV")
    @Test
    public void test1() {
        assertEquals(1, 1);
    }

 
    @Tag("PROD")
    @Test
    public void test2() {
        assertEquals(10, 10);
    }
}