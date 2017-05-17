package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 陈淦 on 2017/5/17. 乡村数据表
 */

public class County extends DataSupport {

    private int id;

    private String countyName;

    private String weatherId;//记录当前县所对应的天气id

    private int cityId;//记录当前县所属的市

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
