package com.coolweather.android.gson;


import com.google.gson.annotations.SerializedName;

public class Forecast {
    public String date;

    @SerializedName("tmp")
    public Temperature tempture;

    @SerializedName("cond")
    public More more;

    private class Temperature {
        public String max;
        public String min;
    }

    private class More {
        @SerializedName("text_d")
        public String info;
    }
}
