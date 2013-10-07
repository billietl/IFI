package fr.univlille1.tiir.music.dao.impl;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="utilisateur")
public class Utilisateur implements fr.univlille1.tiir.music.dao.Utilisateur {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name="nom", nullable=false)
	private String nom;
	
	@Column(name="prenom", nullable=false)
	private String prenom;
	
	@Column(name="pseudo", nullable=false)
	private String pseudo;
	
	@OneToMany(mappedBy="owner")
	private List<Music> discographie;
	
	public long getId() {
		return this.id;
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
