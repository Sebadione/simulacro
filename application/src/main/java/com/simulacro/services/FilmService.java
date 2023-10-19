package com.simulacro.services;

import com.simulacro.models.Film;

import java.util.List;
import java.util.Optional;

public interface FilmService {

    List<Film> getAll();

    Optional<Film> getById(Long id);

    void borrarFilm(Film film);

    Film agregarFilm(Film film);

    Optional<Film> modificarFilm(Film film);
}
