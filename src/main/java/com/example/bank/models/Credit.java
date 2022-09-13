package com.example.bank.models;

import javax.persistence.*;

@Entity
@Table(name = "credit")
public class Credit {

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
    @JoinColumn(name = "compted")
    private Compte compted;

    public Credit(String description, int montant, Compte compted) {
        this.description = description;
        this.montant = montant;
        this.compted = compted;
    }

    public Credit() {

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

    public Compte getCompted() {
        return compted;
    }

    public void setCompted(Compte compted) {
        this.compted = compted;
    }
}
