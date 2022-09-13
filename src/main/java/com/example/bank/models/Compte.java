package com.example.bank.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "compte")
public class Compte implements Serializable {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType. IDENTITY)
    private long id;

    @Basic
    @Column(name = "nom")
    private String nom;

    @Basic
    @Column(name = "solde")
    private int solde;

    public Compte(String nom, int solde) {
        this.nom = nom;
        this.solde = solde;
    }

    public Compte() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getSolde() {
        return solde;
    }

    public void setSolde(int solde) {
        this.solde = solde;
    }
    }
