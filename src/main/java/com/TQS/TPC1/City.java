package com.TQS.TPC1;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.StringJoiner;

@JsonIgnoreProperties(ignoreUnknown = true)
public class City {
    private String status;
    private Data data;
    private int id;
    private String city_name;
    private int o3;

    public City() {}

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public Data getData() { return data; }
    public void setData(Data data) { this.data = data; }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    @Override
    public String toString() {
        return new StringJoiner(", ", City.class.getSimpleName() + "[", "]")
                .add("status=" + status)
                .add("data='" + data.toString())
                .toString();
    }
}
