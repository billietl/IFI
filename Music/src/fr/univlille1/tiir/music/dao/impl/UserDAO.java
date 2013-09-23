package fr.univlille1.tiir.music.dao.impl;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class UserDAO implements fr.univlille1.tiir.music.dao.User{
	
	private static final long serialVersionUID = 1L;
	
	// Persistent Fields:
    @Id
    @GeneratedValue
    Long id;
    private String pseudo;
 
    // Constructors:
    public UserDAO() {
    }
 
    public UserDAO(String pseudo) {
        this.pseudo = pseudo;
    }
 
    // String Representation:
    @Override
    public String toString() {
        return "Utilisateur : " + pseudo;
    }
}
