package fr.eni.tp.filmotheque.bo;

import java.util.ArrayList;

public class Participant extends Personne{
    ArrayList<Film> films = new ArrayList<>();
    public Participant(long id, String nom, String prenom) {
        super(id, nom, prenom);
    }

    public ArrayList<Film> getFilms() {
        return films;
    }

    public void setFilms(ArrayList<Film> films) {
        this.films = films;
    }
}
