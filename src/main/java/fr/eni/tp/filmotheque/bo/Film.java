package fr.eni.tp.filmotheque.bo;

import java.util.ArrayList;

public class Film {
    long id;
    String titre, synopsis;
    int annee, duree;
    Participant realisateur;
    ArrayList<Participant> acteurs = new ArrayList<>();
    ArrayList<Avis> avis = new ArrayList<>();
    Genre genre;



    public Film(long id, String titre, int annee, int duree, String synopsis) {
        this.id = id;
        this.titre = titre;
        this.synopsis = synopsis;
        this.annee = annee;
        this.duree = duree;
    }

    public ArrayList<Avis> getAvis() {
        return avis;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public Participant getRealisateur() {
        return realisateur;
    }

    public void setRealisateur(Participant realisateur) {
        this.realisateur = realisateur;
    }

    public ArrayList<Participant> getActeurs() {
        return acteurs;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Film(").append(id).append(")").append("\n");
        sb.append("- Titre : ").append(titre).append("\n");
        sb.append("- Synopsis : ").append(synopsis).append("\n");
        sb.append("- Annee : ").append(annee).append("\n");
        sb.append("- Duree : ").append(convertMinutesToHoursAndMinutes(duree)).append("\n");
        sb.append("- Realisateur : ").append(realisateur).append("\n");
        sb.append("- Acteurs : ").append(acteurs.toString()).append("\n");
        sb.append("- Avis : ").append(avis.toString()).append("\n");
        sb.append("- Genre : ").append(genre).append("\n");
        return sb.toString();
    }

    private String convertMinutesToHoursAndMinutes(int minutes) {
        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;
        return hours + "h " + remainingMinutes + "m";
    }
}

