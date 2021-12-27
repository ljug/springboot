/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.pascalfares.DaoDto.DTO;

/**
 *
 * @author Pascal Fares
 */
public class Contact {
    private String nom;
    private String email;
    
    public Contact (String nom, String email) {
        this.nom=nom;
        this.email=email;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
