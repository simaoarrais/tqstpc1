package com.TQS.TPC1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.ui.ModelMap;

import java.util.List;
import java.util.Map;

@Controller
public class Weather {
    private RestTemplate rest;
    static final String BASE_URL = "https://api.waqi.info/feed/";
    static final String API_KEY = "/?token=5fc89669c6637fdb5b22f587e8096b0e578a8893";

    @Autowired
    private ICityService cityService;

    @GetMapping("")
    public String home() {
        return "sendLocation";
    }

    @PostMapping("/locationInfo")
    public String locationInfo(@RequestParam("location") String location,
                                ModelMap modelMap) {
        //Passar location para outro jsp
        modelMap.put("location", location);

        //Chamada na API
        rest = new RestTemplate();
        String URI = BASE_URL + location + API_KEY;

        //Var para verificar se a cidade consta na API
        CityCheck citycheck = rest.getForObject(URI, CityCheck.class);

        if (citycheck.getStatus().equals("ok")) {
            System.out.println(cityService.findByName(location));
            City city = rest.getForObject(URI, City.class);

            //Passar as variáveis para o jsp
            modelMap.put("aqi", city.getData().getAqi());
            modelMap.put("no2", city.getData().getIaqi().getNO2().getV());
            modelMap.put("o3", city.getData().getIaqi().getO3().getV());
            modelMap.put("pm10", city.getData().getIaqi().getPM10().getV());

            //Guardar cidade na bd
            cityService.insertCity(city);
            return "viewLocation";
        }

        return "error";
    }
}
