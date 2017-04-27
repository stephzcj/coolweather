package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by zhongchunjie on 17/4/27.
 */

public class Forecast {
    public String date;
    @SerializedName("cond")
    public Condition info;
    @SerializedName("tmp")
    public Temperature temperature;
    public class Condition{
        @SerializedName("txt_d")
        public String dayDescription;
        @SerializedName("txt_n")
        public String nightDescription;
    }
    public class Temperature{
        @SerializedName("max")
        public String maxTemperature;
        @SerializedName("min")
        public String minTemperature;
    }
}
