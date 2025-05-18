package model;

import java.util.EnumMap;


public class SignalTiming {
    private EnumMap<Direction, Integer> greenTimes;

    public SignalTiming() {
        greenTimes = new EnumMap<>(Direction.class);
        for (Direction dir : Direction.values()) {
            greenTimes.put(dir, 10); // varsayılan süre
        }
    }

    public void setGreenTime(Direction direction, int seconds) {
        greenTimes.put(direction, seconds);
    }

    public int getGreenTime(Direction direction) {
        return greenTimes.get(direction);
    }
}
