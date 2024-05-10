package Dao;

import Model.Client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        Airport airport = new Airport("Airportfdf Name", "Departure City", "Arrival City", "Country");
        entityManager.persist(airport);

        transaction.commit();
        entityManager.close();
        entityManagerFactory.close();

        System.out.println("Record Saved Successfully!");
    }
}
