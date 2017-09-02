package com.guohua.chihuo;

/**
 * Created by guohuajiang on 9/1/17.
 */

/**
 * This is used to measure the latency of rendering UI.
 */
public class Clock {
    long startTime;
    long endTime;

    public void reset() {
        startTime = 0;
        endTime = 0;
    }

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public void stop() {
        endTime = System.currentTimeMillis();
    }

    public long getCurrentInterval() {
        return endTime - startTime;
    }
}
