package fr.univlille1.tiir.music.dao.impl;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

import fr.univlille1.tiir.music.dao.*;

@Entity
@IdClass(ShareDAOIdClass.class)
public class Share implements fr.univlille1.tiir.music.dao.Share{
	
	private static final long serialVersionUID = 1L;
	
	// Persistent Fields:
    @Id
    private Music piste;
    @Id
    private User utilisateur;
 
    // Constructors:
    public Share() {
    }
 
    public Share(User utilisateur, Music piste) {
        this.utilisateur = utilisateur;
        this.piste = piste;
    }
 
    // String Representation:
    @Override
    public String toString() {
        return piste + " est partagé avec " + utilisateur;
    }
}
