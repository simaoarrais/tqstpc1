package com.TQS.TPC1;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.StringJoiner;

public class Iaqi {
    @JsonProperty("no2")
    private NO2 no2;
    @JsonProperty("o3")
    private O3 o3;
    @JsonProperty("pm10")
    private PM10 pm10;

    public NO2 getNO2() { return no2; }
    public void setNO2(NO2 no2) { this.no2 = no2; }

    public O3 getO3() { return o3; }
    public void setO3(O3 o3) { this.o3 = o3; }

    public PM10 getPM10() { return pm10; }
    public void setPM10(PM10 pm10) { this.pm10 = pm10; }

    @Override
    public String toString() {
        return new StringJoiner(", ", Iaqi.class.getSimpleName() + "[", "]")
                .add("no2=" + no2)
                .add("o3='" + o3 + "'")
                .add("pm10=" + pm10)
                .toString();
    }
}