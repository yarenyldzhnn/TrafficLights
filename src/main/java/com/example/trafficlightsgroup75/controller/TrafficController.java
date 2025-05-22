package com.example.trafficlightsgroup75.controller;

import com.example.trafficlightsgroup75.model.Direction;
import com.example.trafficlightsgroup75.model.SignalTiming;
import com.example.trafficlightsgroup75.model.TrafficDensity;

public class TrafficController {
    private final TrafficDensity density;
    private final SignalTiming timing;

    public TrafficController() {
        density = new TrafficDensity();
        timing = new SignalTiming();
    }

    public void updateDensity(Direction dir, int value) {
        density.setDensity(dir, value);
    }

    public void calculateSignalTimings() {
        for (Direction dir : Direction.values()) {
            int densityValue = density.getDensity(dir);
            int greenTime = Math.min(30, Math.max(5, densityValue * 2));
            timing.setGreenTime(dir, greenTime);
        }
    }

    public int getGreenTime(Direction dir) {
        return timing.getGreenTime(dir);
    }
}

