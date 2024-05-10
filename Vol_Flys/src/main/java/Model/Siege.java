package Model;

import jakarta.persistence.*;

@Entity
@Table(name = "Siege")
public class Siege {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSiege;

    @Column(name = "estDisponible")
    private boolean estDisponible;

//    @ManyToOne
//    @JoinColumn(name = "idReservation")
//    private Reservation reservation;


    public int getIdSiege() {
        return idSiege;
    }

    public void setIdSiege(int idSiege) {
        this.idSiege = idSiege;
    }

    public boolean isEstDisponible() {
        return estDisponible;
    }

    public void setEstDisponible(boolean estDisponible) {
        this.estDisponible = estDisponible;
    }
}