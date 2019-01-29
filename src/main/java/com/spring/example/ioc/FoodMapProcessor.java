package com.spring.example.ioc;

import java.util.HashMap;
import java.util.Map;

class FoodMapProcessor {

    //https://stackoverflow.com/questions/38021061/how-to-use-if-else-logic-in-java-8-stream-foreach?noredirect=1&lq=1

    Map<String, String> mapProcesssor(Map<String, String> input) {
        Map<String, String> result = new HashMap<>(input);

        result.forEach((key, value) -> {
            if (key.equals("ice cream")) {
                result.put("ice cream", "cherry");
            }
        });

        result.put("bread", "butter");
        return result;
    }
}
