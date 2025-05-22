package com.example.trafficlightsgroup75.model;
import java.util.EnumMap;

public class TrafficDensity {
    private EnumMap<Direction, Integer> densityMap;

    public TrafficDensity() {
        densityMap = new EnumMap<>(Direction.class);
        for (Direction dir : Direction.values()) {
            densityMap.put(dir, 0);
        }
    }

    public void setDensity(Direction direction, int count) {
        densityMap.put(direction, count);
    }

    public int getDensity(Direction direction) {
        return densityMap.get(direction);
    }
}
