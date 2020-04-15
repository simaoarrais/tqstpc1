package com.TQS.TPC1;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.persistence.EntityNotFoundException;

import static com.TQS.TPC1.Weather.API_KEY;
import static com.TQS.TPC1.Weather.BASE_URL;

@RestController
public class API {
    private static final String template = "Hey there boy, hold your horses!";

    @GetMapping("/city/{city_name}")
    public static String city(@PathVariable String city_name) {
        RestTemplate rest = new RestTemplate();
        String URI = BASE_URL + city_name + API_KEY;
        return rest.getForObject(URI, City.class).toString();
    }

    @ExceptionHandler(EmptyResultDataAccessException.class)
    public ResponseEntity<String> noCityFound(EmptyResultDataAccessException e) {

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No City found");
    }

    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity<String> noCityFound(EntityNotFoundException e) {

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No City found");
    }
}
