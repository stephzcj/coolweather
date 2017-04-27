package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by zhongchunjie on 17/4/27.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String pm25;
        public String aqi;
        @SerializedName("qlty")
        public String polluteLevelDescription;

    }
}
