package tech.spring.sa_backend.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import tech.spring.sa_backend.entities.Rating;
import tech.spring.sa_backend.service.RatingService;

import static  org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(path = "rating", produces = MediaType.APPLICATION_JSON_VALUE)
public class RatingController {
    private RatingService ratingService;

    public RatingController(RatingService ratingService) {
        this.ratingService = ratingService;
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(consumes = APPLICATION_JSON_VALUE)
    public void creer(@RequestBody Rating rating) {
        this.ratingService.creer(rating);
    }
}
