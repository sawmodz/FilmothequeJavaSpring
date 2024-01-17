package fr.eni.tp.filmotheque.bo;

import java.util.Objects;

public class Avis {
    long id;
    int note;
    String commentaire;

    Membre membre;

    public Avis(long id, int note, String commentaire, Membre membre) {
        this.id = id;
        this.note = note;
        this.commentaire = commentaire;
        this.membre = membre;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public Membre getMembre() {
        return membre;
    }

    public void setMembre(Membre membre) {
        this.membre = membre;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("\n  📝 Avis de ").append(membre).append(" : \n");
        sb.append("    - ⭐ Note : ").append(note).append("\n");
        sb.append("    - 💬 Commentaire : ").append(commentaire).append("\n");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Avis avis = (Avis) o;
        return id == avis.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
