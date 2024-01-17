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
        sb.append(", titre:'").append(titre).append('\'').append("\n");
        sb.append(", synopsis:'").append(synopsis).append('\'').append("\n");
        sb.append(", annee:").append(annee).append("\n");
        sb.append(", duree:").append(duree).append("\n");
        sb.append(", realisateur:").append(realisateur).append("\n");
        sb.append(", acteurs:").append(acteurs.toString()).append("\n");
        sb.append(", avis:").append(avis.toString()).append("\n");
        sb.append(", genre:").append(genre).append("\n");
        return sb.toString();
    }
}
