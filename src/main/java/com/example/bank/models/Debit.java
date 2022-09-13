package com.example.bank.models;

import javax.persistence.*;

@Entity
@Table(name = "debit")
public class Debit {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType. IDENTITY)
    private int id;

    @Basic
    @Column(name = "description")
    private String description;

    @Basic
    @Column(name = "montant")
    private int montant;

    @ManyToOne()
    @JoinColumn(name = "comptec")
    private Compte comptec;

    public Debit(String description, int montant, Compte comptec) {
        this.description = description;
        this.montant = montant;
        this.comptec = comptec;
    }

    public Debit() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getMontant() {
        return montant;
    }

    public void setMontant(int montant) {
        this.montant = montant;
    }

    public Compte getComptec() {
        return comptec;
    }

    public void setComptec(Compte comptec) {
        this.comptec = comptec;
    }

}
