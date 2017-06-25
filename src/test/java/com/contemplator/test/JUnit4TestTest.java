package com.contemplator.test;

import org.junit.Test;

import static org.junit.Assert.*;

public class JUnit4TestTest {
    @Test
    public void test() throws Exception {
        assertEquals(4, new JUnit4Test().test());
    }
}