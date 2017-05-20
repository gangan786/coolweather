package com.coolweather.android.gson;


import com.google.gson.annotations.SerializedName;

public class Suggestion {
    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

public Sport sport;

    private class Comfort {
        @SerializedName("text")
        public String info;
    }

    private class CarWash {
        @SerializedName("text")
        public String info;
    }

    private class Sport {
        @SerializedName("text")
        public String info;
    }
}
