package com.TQS.TPC1;

import java.util.StringJoiner;

public class ModelCity {
    private int id;
    private String city_name;
    private int o3;

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getO3() { return o3; }
    public void setO3(int o3) { this.o3 = o3; }

    public String getName() { return city_name; }
    public void setName(String city_name) { this.city_name = city_name; }

    @Override
    public String toString() {
        return new StringJoiner(", ", City.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("name='" + city_name + "'")
                .add("o3=" + o3)
                .toString();
    }
}
