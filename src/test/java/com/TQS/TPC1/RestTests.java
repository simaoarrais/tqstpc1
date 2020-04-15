package com.TQS.TPC1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import com.TQS.TPC1.API;

@SpringBootTest
public class RestTests {
    private String BASE_URL;
    private String API_KEY;
    private RestTemplate rest;

    @Before
    public void setUp() {
        BASE_URL = "https://api.waqi.info/feed/";
        API_KEY = "/?token=5fc89669c6637fdb5b22f587e8096b0e578a8893";
        rest = new RestTemplate();
    }

    @Test
    public void restMustSame() throws IOException {
        String URI = BASE_URL + "Lisboa" + API_KEY;
        City city = rest.getForObject(URI, City.class);
        String city2 = API.city("Lisboa");
        Assert.assertTrue(city.toString().equals(city2));
    }
}
