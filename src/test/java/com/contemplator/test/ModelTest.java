package com.contemplator.test;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ModelTest {

    private Model model;

    @Before
    public void setUp() throws Exception {
        model = new Model();
    }

    @Test
    public void sum() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                assertEquals(i + j, model.sum(i, j));
            }
        }
    }

    @Test
    public void mul() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                assertEquals(i * j, model.mul(i, j));
            }
        }
    }

}