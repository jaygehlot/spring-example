package com.spring.example.ioc;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static java.util.Collections.EMPTY_MAP;
import static org.junit.Assert.assertEquals;

public class FoodMapProcessorTest {

    @Test
    public void test1() {
        Map<String, String> inputMap = new HashMap<>();
        inputMap.put("ice cream", "peanuts");

        Map<String, String> outputExpectedMap = new HashMap<>();
        outputExpectedMap.put("ice cream", "cherry");
        outputExpectedMap.put("bread", "butter");

        FoodMapProcessor foodMapProcessor = new FoodMapProcessor();
        assertEquals(outputExpectedMap, foodMapProcessor.mapProcesssor(inputMap));
    }

    @Test
    public void test2() {
        Map inputMap = EMPTY_MAP;

        Map<String, String> outputExpectedMap = new HashMap<>();
        outputExpectedMap.put("bread", "butter");

        FoodMapProcessor foodMapProcessor = new FoodMapProcessor();
        assertEquals(outputExpectedMap, foodMapProcessor.mapProcesssor(inputMap));
    }

    @Test
    public void test3() {
        Map<String, String> inputMap = new HashMap<>();
        inputMap.put("pancake", "syrup");

        Map<String, String> outputExpectedMap = new HashMap<>();
        outputExpectedMap.put("bread", "butter");
        outputExpectedMap.put("pancake", "syrup");


        FoodMapProcessor foodMapProcessor = new FoodMapProcessor();
        assertEquals(outputExpectedMap, foodMapProcessor.mapProcesssor(inputMap));
    }

    @Test
    public void test4() {
        Map<String, String> inputMap = new HashMap<>();
        inputMap.put("bread", "dirt");
        inputMap.put("ice cream", "strawberries");

        Map<String, String> outputExpectedMap = new HashMap<>();
        outputExpectedMap.put("bread", "butter");
        outputExpectedMap.put("ice cream", "cherry");


        FoodMapProcessor foodMapProcessor = new FoodMapProcessor();
        assertEquals(outputExpectedMap, foodMapProcessor.mapProcesssor(inputMap));
    }

    @Test
    public void test5() {
        Map<String, String> inputMap = new HashMap<>();
        inputMap.put("bread", "jam");
        inputMap.put("ice cream", "strawberries");
        inputMap.put("salad", "oil");

        Map<String, String> outputExpectedMap = new HashMap<>();
        outputExpectedMap.put("bread", "butter");
        outputExpectedMap.put("ice cream", "cherry");
        outputExpectedMap.put("salad", "oil");


        FoodMapProcessor foodMapProcessor = new FoodMapProcessor();
        assertEquals(outputExpectedMap, foodMapProcessor.mapProcesssor(inputMap));
    }

}
