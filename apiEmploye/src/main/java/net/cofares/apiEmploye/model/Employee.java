package net.cofares.apiEmploye.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

//une annotation Lombok. Nul besoin d’ajouter les getters et les setters. 
//La librairie Lombok s’en charge pour nous. Très utile pour alléger le code
@Data

//une annotation qui indique que la classe correspond à une table 
//de la base de données.
@Entity

// indique le nom de la table associée.
@Table(name = "employees")
public class Employee {

    /**
     * L’attribut id correspond à la clé primaire de la table, 
     * et est donc annoté @Id. D’autre part, comme l’id est auto-incrémenté, 
     * c'est le role de l’annotation 
     * GeneratedValue(strategy = GenerationType.IDENTITY).
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //pour faire le lien avec le nom du champ de la table.
    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    private String mail;

    private String password;

}