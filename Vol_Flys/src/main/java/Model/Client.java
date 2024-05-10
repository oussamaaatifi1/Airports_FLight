package Model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Client")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idClient;

    @Column(name = "nom")
    private String nom;

    @Column(name = "prenom")
    private String prenom;

    @Column(name = "dob")
    private String dob;

//    @OneToMany(mappedBy = "client")
//    private List<Reservation> reservations;


    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
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

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
}

