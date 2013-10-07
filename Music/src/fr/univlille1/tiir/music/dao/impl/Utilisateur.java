package fr.univlille1.tiir.music.dao.impl;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="utilisateur")
public class Utilisateur implements fr.univlille1.tiir.music.dao.Utilisateur {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long utilisateur_id;
	private String nom;
	private String prenom;
	private String pseudo;
	
	public long getId() {
		return this.utilisateur_id;
	}

	public String getNom() {
		return this.nom;
	}

	public String getPrenom() {
		return this.prenom;
	}

	public String getPseudo() {
		return this.pseudo;
	}

}
