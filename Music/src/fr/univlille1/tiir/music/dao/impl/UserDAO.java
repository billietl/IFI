package fr.univlille1.tiir.music.dao.impl;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserDAO implements fr.univlille1.tiir.music.dao.User{
	
	private static final long serialVersionUID = 1L;
	
	// Persistent Fields:
    @Id
    private String pseudo;
    private String passwd;
    private List<fr.univlille1.tiir.music.dao.Music> bibliothèque; // relation avec Music (Own)
 
    // Constructors:
    public UserDAO() {
    }
 
    public UserDAO(String pseudo, String passwd) {
        this.pseudo = pseudo;
        this.passwd = passwd;
    }
 
    // String Representation:
    @Override
    public String toString() {
        return "Utilisateur : " + pseudo;
    }

	public String getNickName() {
		return this.pseudo;
	}
}
