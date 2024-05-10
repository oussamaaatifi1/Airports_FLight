package Model;


import jakarta.persistence.*;

@Entity
@Table(name = "Passager")
public class Passager {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPassager;

    @Column(name = "nom")
    private String nom;

    @Column(name = "prenom")
    private String prenom;

    @Column(name = "attribute1")
    private String attribute1;

//    @ManyToMany(mappedBy = "concerner")
//    private List<Reservation> reservations;


    public int getIdPassager() {
        return idPassager;
    }

    public void setIdPassager(int idPassager) {
        this.idPassager = idPassager;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAttribute1() {
        return attribute1;
    }

    public void setAttribute1(String attribute1) {
        this.attribute1 = attribute1;
    }
}
