package com.TQS.TPC1;

import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;

@SpringBootTest
class Tpc1ApplicationTests {
	private String BASE_URL;
	private String API_KEY;
	private RestTemplate rest;
	private CityRepository cityService;

	@Before
	public void setUp() {
		BASE_URL = "https://api.waqi.info/feed/";
		API_KEY = "/?token=5fc89669c6637fdb5b22f587e8096b0e578a8893";
	}

	@Test
	void insertBdTest() {
		rest = new RestTemplate();
		String URI = BASE_URL + "Lisboa" + API_KEY;
		City city = rest.getForObject(URI, City.class);
		cityService.insertCity(city);
		Assertions.assertNotNull(cityService.findByName("Lisboa"));
	}


}
