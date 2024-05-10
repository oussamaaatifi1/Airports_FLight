package Model;

import jakarta.persistence.*;

@Entity
@Table(name = "Vol")
public class Vol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idVol;

    @Column(name = "dateDepart")
    private String dateDepart;

    @Column(name = "duree")
    private int duree;

    @Column(name = "dateArrivee")
    private String dateArrivee;

    @Column(name = "heureDepart")
    private String heureDepart;

    @Column(name = "heureArrivee")
    private String heureArrivee;

    @Column(name = "villeDepart")
    private String villeDepart;

    @Column(name = "villeArrivee")
    private String villeArrivee;

//    @ManyToOne
//    @JoinColumn(name = "idCompagnie")
//    private Compagnie compagnie;
//
//    @ManyToMany(mappedBy = "vols")
//    private List<Reservation> reservations;


    public int getIdVol() {
        return idVol;
    }

    public void setIdVol(int idVol) {
        this.idVol = idVol;
    }

    public String getDateDepart() {
        return dateDepart;
    }

    public void setDateDepart(String dateDepart) {
        this.dateDepart = dateDepart;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public String getDateArrivee() {
        return dateArrivee;
    }

    public void setDateArrivee(String dateArrivee) {
        this.dateArrivee = dateArrivee;
    }

    public String getHeureDepart() {
        return heureDepart;
    }

    public void setHeureDepart(String heureDepart) {
        this.heureDepart = heureDepart;
    }

    public String getHeureArrivee() {
        return heureArrivee;
    }

    public void setHeureArrivee(String heureArrivee) {
        this.heureArrivee = heureArrivee;
    }

    public String getVilleDepart() {
        return villeDepart;
    }

    public void setVilleDepart(String villeDepart) {
        this.villeDepart = villeDepart;
    }

    public String getVilleArrivee() {
        return villeArrivee;
    }

    public void setVilleArrivee(String villeArrivee) {
        this.villeArrivee = villeArrivee;
    }
}

