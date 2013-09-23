package fr.univlille1.tiir.music.dao.Impl;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User implements Serializable{
	private static final long serialVersionUID = 1L;
	
	// Persistent Fields:
    @Id
    @GeneratedValue
    Long id;
    private String pseudo;
 
    // Constructors:
    public User() {
    }
 
    public User(String pseudo) {
        this.pseudo = pseudo;
    }
 
    // String Representation:
    @Override
    public String toString() {
        return "Utilisateur : " + pseudo;
    }
}
