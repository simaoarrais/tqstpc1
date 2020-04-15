package com.TQS.TPC1;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.StringJoiner;

public class Data {
    @JsonProperty("aqi")
    private int aqi;
    @JsonProperty("iaqi")
    private Iaqi iaqi;
    @JsonProperty("city")
    private CityInfo cityInfo;

    public int getAqi() { return aqi; }
    public void setAqi(int aqi) { this.aqi = aqi; }

    public CityInfo getCityInfo() { return cityInfo; }
    public void setCityInfo(CityInfo cityInfo) { this.cityInfo = cityInfo; }

    public Iaqi getIaqi() { return iaqi; }
    public void setIaqi(Iaqi iaqi) { this.iaqi = iaqi; }

    @Override
    public String toString() {
        return new StringJoiner(", ", Data.class.getSimpleName() + "[", "]")
                .add("aqi=" + aqi)
                .add("city_info='" + cityInfo.toString() + "'")
                .add("iaqi=" + iaqi.toString())
                .toString();
    }

}
