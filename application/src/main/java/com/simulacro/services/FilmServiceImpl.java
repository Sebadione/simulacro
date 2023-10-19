package com.simulacro.services;

import com.simulacro.models.Film;
import com.simulacro.repositories.FilmRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FilmServiceImpl implements FilmService{

    private final FilmRepository filmRepository;

    public FilmServiceImpl(FilmRepository filmRepository) {
        this.filmRepository = filmRepository;
    }

    @Override
    public List<Film> getAll() {
        return filmRepository.findAll();
    }

    @Override
    public Optional<Film> getById(Long id) {
        return filmRepository.findById(id);
    }

    @Override
    public void borrarFilm(Film film) {
        filmRepository.delete(film);
    }

    @Override
    public Film agregarFilm(Film film) {
        return filmRepository.save(film);
    }

    @Override
    public Optional<Film> modificarFilm(Film film) {
        if (filmRepository.existsById(film.getId())) {
             return Optional.of(filmRepository.save(film));
        }
        return Optional.empty();
    }
}
