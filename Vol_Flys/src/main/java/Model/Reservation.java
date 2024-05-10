package Model;

import jakarta.persistence.*;


@Entity
@Table(name = "Reservation")
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idReservation;

    @Column(name = "dateReservation")
    private String dateReservation;

    @ManyToOne
    @JoinColumn(name = "idClient")
    private Client client;

//    @ManyToMany
//    @JoinTable(name = "Reservation_Passager",
//            joinColumns = @JoinColumn(name = "idReservation"),
//            inverseJoinColumns = @JoinColumn(name = "idPassager"))
//    private List<Passager> concerner;
//
//    @ManyToMany
//    @JoinTable(name = "Reservation_Vol",
//            joinColumns = @JoinColumn(name = "idReservation"),
//            inverseJoinColumns = @JoinColumn(name = "idVol"))
//    private List<Vol> vols;


    public int getIdReservation() {
        return idReservation;
    }

    public void setIdReservation(int idReservation) {
        this.idReservation = idReservation;
    }

    public String getDateReservation() {
        return dateReservation;
    }

    public void setDateReservation(String dateReservation) {
        this.dateReservation = dateReservation;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}

