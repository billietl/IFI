package fr.univlille1.tiir.music.dao.impl;

import javax.persistence.Entity;
import javax.persistence.Id;

import fr.univlille1.tiir.music.dao.*;

@Entity
public class ShareDAO implements fr.univlille1.tiir.music.dao.Share{
	
	private static final long serialVersionUID = 1L;
	
	// Persistent Fields:
    @Id
    private Music piste;
    @Id
    private User utilisateur;
 
    // Constructors:
    public ShareDAO() {
    }
 
    public ShareDAO(User utilisateur, Music piste) {
        this.utilisateur = utilisateur;
        this.piste = piste;
    }
 
    // String Representation:
    @Override
    public String toString() {
        return piste + " est partagé avec " + utilisateur;
    }
}
