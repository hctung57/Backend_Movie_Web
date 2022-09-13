package com.test.nmt.api.movie;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.nmt.model.movie.MovieDTO;
import com.test.nmt.service.movie.MovieService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/movies")
public class MovieController {
    @Autowired
    MovieService movieService;

    @GetMapping
    public List<MovieDTO> getAllMovie() {
        return movieService.findAll();
    }

    @GetMapping("{id}")
    public MovieDTO getMovieById(@PathVariable Long id) {
        return movieService.findById(id);
    }

    @PostMapping
    public void createMovie(@RequestBody MovieDTO movieDTO) {

    }

}
