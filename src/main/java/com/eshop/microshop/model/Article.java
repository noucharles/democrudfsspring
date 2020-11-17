package com.eshop.microshop.model;

import javax.persistence.*;

@Entity
public class Article {

    @Id
    @GeneratedValue
    private int id;

    private String nom;

    private int prixAchat;

    public Article() {

    }

    public Article(int id, String nom, int prixAchat) {
        this.id = id;
        this.nom = nom;
        this.prixAchat = prixAchat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPrixAchat() {
        return prixAchat;
    }

    public void setPrixAchat(int prixAchat) {
        this.prixAchat = prixAchat;
    }
}
