package me.maxandroid.coolweather.gson;

/**
 * Created by MXZ on 2018/1/14.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
