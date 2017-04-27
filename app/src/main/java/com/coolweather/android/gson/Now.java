package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by zhongchunjie on 17/4/27.
 */

public class Now {
    @SerializedName("fl")
    public String feelTemperature;
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public Condition weatherInfo;
    public class Condition{
        @SerializedName("txt")
        public String weatherDescription;
    }
}
