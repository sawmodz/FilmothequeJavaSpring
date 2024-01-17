package fr.eni.tp.filmotheque.bo;

import java.util.ArrayList;
import java.util.Objects;

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
        final StringBuffer sb = new StringBuffer("🎬 Film(").append(id).append(")").append("\n");
        sb.append("- 📌 Titre : ").append(titre).append("\n");
        sb.append("- 📖 Synopsis : ").append(synopsis).append("\n");
        sb.append("- 📅 Annee : ").append(annee).append("\n");
        sb.append("- ⏱ Duree : ").append(convertMinutesToHoursAndMinutes(duree)).append("\n");
        sb.append("- 🎥 Realisateur : ").append(realisateur);
        if(this.acteurs.contains(this.realisateur)) sb.append(" (Aussi acteur)");
        sb.append("\n");
        sb.append("- 🌟 Acteurs : ").append(acteurs.toString()).append("\n");
        sb.append("- 📝 Avis : ").append(getNoteByStar(getAverageNote(avis))).append(avis.toString()).append("\n");
        sb.append("- 🎭 Genre : ").append(genre).append("\n");
        return sb.toString();
    }

    private String convertMinutesToHoursAndMinutes(int minutes) {
        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;
        return hours + "h " + remainingMinutes + "m";
    }

    private double getAverageNote(ArrayList<Avis> listAvis){
        double total = 0.0;
        for (Avis avis : listAvis) {
            total += avis.getNote();
        }

        return total / listAvis.size();
    }

    private String getNoteByStar(double note){
        int round = (int) note;

        StringBuilder result = new StringBuilder();

        result.append("⭐".repeat(Math.max(0, round)));

        return result.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Film film = (Film) o;
        return id == film.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

