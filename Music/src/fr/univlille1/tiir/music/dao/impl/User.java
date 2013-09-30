package fr.univlille1.tiir.music.dao.impl;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User implements fr.univlille1.tiir.music.dao.User {

	@Id
	private long id;
	private String nom;
	private String prenom;
	private String pseudo;
	
	@Override
	public long getId() {
		return this.id;
	}

	@Override
	public String getNom() {
		return this.nom;
	}

	@Override
	public String getPrenom() {
		return this.prenom;
	}

	@Override
	public String getPseudo() {
		return this.pseudo;
	}

}
