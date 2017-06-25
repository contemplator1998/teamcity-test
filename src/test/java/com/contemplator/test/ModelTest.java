package com.contemplator.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class ModelTest {

    private Model model;

    @BeforeEach
    void setUp() {
        model = new Model();
    }

    @org.junit.jupiter.api.Test
    void sum() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                Assertions.assertEquals(i + j, model.sum(i, j));
            }
        }
    }

    @org.junit.jupiter.api.Test
    void mul() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                Assertions.assertEquals(i * j, model.mul(i, j));
            }
        }
    }

}