package com.simulacro.application.controllers;

import com.simulacro.models.Film;
import com.simulacro.services.FilmService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/film")
public class FilmController {

    private FilmService filmService;

    public FilmController(FilmService filmService) {
        this.filmService = filmService;
    }

    @GetMapping
    public List<Film> getAll() {
        return filmService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Film> getById(@PathVariable long id) {
        return filmService.getById(id);
    }

    @PostMapping
    public Film agregarFilm(@RequestBody Film film) {
        return filmService.agregarFilm(film);
    }
}
