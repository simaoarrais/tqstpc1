package com.TQS.TPC1;

import java.util.List;
import java.util.Map;

public interface ICityService {
    List<City> findAll();
    City findById(int id);
    void insertCity(City city);
    List<Map<String, Object>> findByName(String name);
}
