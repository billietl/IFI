package fr.univlille1.tiir.music.dao.impl;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class MusicDAO implements fr.univlille1.tiir.music.dao.Music{

	private static final long serialVersionUID = 1L;
	
	// Persistent Fields:
    @Id
    @GeneratedValue
    Long id;
    private String titre;
 
    // Constructors:
    public MusicDAO() {
    }
 
    public MusicDAO(String titre) {
        this.titre = titre;
    }
 
    // String Representation:
    @Override
    public String toString() {
        return "Musique : " + titre;
    }
    
}
