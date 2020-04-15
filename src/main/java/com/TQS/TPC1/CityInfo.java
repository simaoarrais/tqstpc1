package com.TQS.TPC1;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.StringJoiner;

public class CityInfo {
    @JsonProperty("geo")
    private double[] geo;

    @JsonProperty("name")
    private String city_name;

    public double[] getGeo() { return geo; }
    public void setGeo(double[] geo) { this.geo = geo; }

    public String getCity_name() { return city_name; }
    public void setCity_name(String city_name) { this.city_name = city_name; }

    @Override
    public String toString() {
        return new StringJoiner(", ", Iaqi.class.getSimpleName() + "[", "]")
                .add("city_name='" + city_name)
                .toString();
    }
}
