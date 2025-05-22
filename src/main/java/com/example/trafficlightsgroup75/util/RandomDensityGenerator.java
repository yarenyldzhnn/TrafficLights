package com.example.trafficlightsgroup75.util;

import com.example.trafficlightsgroup75.model.Direction;

import java.util.EnumMap;
import java.util.Random;

public class RandomDensityGenerator {
    public static EnumMap<Direction, Integer> generate() {
        EnumMap<Direction, Integer> map = new EnumMap<>(Direction.class);
        Random random = new Random();
        for (Direction dir : Direction.values()) {
            map.put(dir, random.nextInt(10)); // 0–9 arası yoğunluk
        }
        return map;
    }
}
