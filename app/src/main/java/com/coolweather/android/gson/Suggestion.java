package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by zhongchunjie on 17/4/27.
 */

public class Suggestion {
    public Air air;
    @SerializedName("comf")
    public Comfort comfort;
    @SerializedName("cw")
    public CarWash carWash;
    @SerializedName("drsg")
    public Wearing wearing;
    public Sport sport;
    @SerializedName("trav")
    public Travel travel;
    @SerializedName("uv")
    public UvLevel uvLevel;

    public class Air{
        @SerializedName("brf")
        public String breifText;
        @SerializedName("txt")
        public String detailText;
    }
    public class Comfort{
        @SerializedName("brf")
        public String breifText;
        @SerializedName("txt")
        public String detailText;
    }
    public class CarWash{
        @SerializedName("brf")
        public String breifText;
        @SerializedName("txt")
        public String detailText;
    }
    public class Wearing{
        @SerializedName("brf")
        public String breifText;
        @SerializedName("txt")
        public String detailText;
    }
    public class Sport{
        @SerializedName("brf")
        public String breifText;
        @SerializedName("txt")
        public String detailText;
    }
    public class Travel{
        @SerializedName("brf")
        public String breifText;
        @SerializedName("txt")
        public String detailText;
    }
    public class UvLevel{
        @SerializedName("brf")
        public String breifText;
        @SerializedName("txt")
        public String detailText;
    }

}
