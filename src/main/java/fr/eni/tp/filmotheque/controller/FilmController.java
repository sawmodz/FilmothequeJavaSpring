package fr.eni.tp.filmotheque.controller;

import fr.eni.tp.filmotheque.bll.FilmService;
import fr.eni.tp.filmotheque.bll.mock.FilmServiceBouchon;
import fr.eni.tp.filmotheque.bo.Film;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class FilmController {
    FilmService filmService;

    @Autowired
    public FilmController(FilmService filmService) {
        this.filmService = filmService;
    }

    public void afficherFilms(){
        for(Film film : this.filmService.consulterFilms()){
            System.out.println(film.toString());
        }
    }

    public void afficherUnFilm(long id){
        System.out.println(this.filmService.consulterFilmParId(id));
    }
}
