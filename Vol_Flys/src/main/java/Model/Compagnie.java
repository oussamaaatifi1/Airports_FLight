package Model;


import jakarta.persistence.*;
@Entity
@Table(name = "Compagnie")
public class Compagnie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCompagnie;

    @Column(name = "nom")
    private String nom;

//    @OneToMany(mappedBy = "compagnie")
//    private List<Vol> vols;


    public int getIdCompagnie() {
        return idCompagnie;
    }

    public void setIdCompagnie(int idCompagnie) {
        this.idCompagnie = idCompagnie;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}

