package com.TQS.TPC1;

import com.fasterxml.jackson.annotation.JsonProperty;

class CityCheck {
    @JsonProperty("status")
    private String status;

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    @Override
    public String toString() { return String.valueOf(status); }
}

class NO2 {
    @JsonProperty("v")
    private double v;

    public double getV() { return v; }
    public void setV(double v) { this.v = v; }

    @Override
    public String toString() { return String.valueOf(v); }
}

class O3 {
    @JsonProperty("v")
    private double v;

    public double getV() { return v; }
    public void setV(double v) { this.v = v; }

    @Override
    public String toString() { return String.valueOf(v); }
}

class PM10 {
    @JsonProperty("v")
    private double v;

    public double getV() { return v; }
    public void setV(double v) { this.v = v; }

    @Override
    public String toString() { return String.valueOf(v); }
}