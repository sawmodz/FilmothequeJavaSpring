package fr.eni.tp.filmotheque.bo;

public class Genre {
    long id;
    String titre;

    public Genre(long id, String titre) {
        this.id = id;
        this.titre = titre;
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

    @Override
    public String toString() {
        return titre;
    }
}
