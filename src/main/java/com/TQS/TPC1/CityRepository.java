package com.TQS.TPC1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class CityRepository implements ICityService {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public CityRepository() {}

    @Override
    public List<City> findAll() {
        String sql = "SELECT * FROM city";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(City.class));
    }

    @Override
    public City findById(int id) {
        return jdbcTemplate.queryForObject("select * from city where id=?", new Object[] { id },
                new BeanPropertyRowMapper<>(City.class));
    }

    @Override
    public void insertCity(City city) {
        jdbcTemplate.execute("INSERT INTO city (city_name, aqi, no2, o3, pm10) VALUES (\'"
                + city.getData().getCityInfo().getCity_name() + "\'," +
                city.getData().getAqi() + "," +
                city.getData().getIaqi().getNO2() + "," +
                city.getData().getIaqi().getO3() + "," +
                city.getData().getIaqi().getPM10() + ");");
    }

    @Override
    public List<Map<String, Object>> findByName(String name) {
        return jdbcTemplate.queryForList("SELECT * FROM city WHERE city_name LIKE \'" + name + "\'");
    }
}
