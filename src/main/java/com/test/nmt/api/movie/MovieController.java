package com.test.nmt.api.movie;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.test.nmt.model.movie.MovieDTO;
import com.test.nmt.service.movie.MovieService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/movies")
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

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/create")
    public void createMovie(@RequestBody MovieDTO movieDTO) {
        movieService.createMovie(movieDTO);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/update")
    public void updateMovie(@RequestBody MovieDTO movieDTO) {
        movieService.createMovie(movieDTO);
    }

    @PostMapping("/delete")
    @PreAuthorize("hasRole('ADMIN')")
    public void deleteMovie(@RequestParam(name = "id") Long id) {
        movieService.deleteMovieByID(id);
    }

}
