package fr.univlille1.tiir.music.dao.impl;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="music")
public class Music implements fr.univlille1.tiir.music.dao.Music {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name="path", nullable=false)
	private String path;
	
	@Column(name="titre", nullable=false)
	private String titre;
	
	@Column(name="artiste", nullable=false)
	private String artiste;

	@ManyToOne
	@JoinColumn(name="owner")
	private Utilisateur owner;
	
	public long getId() {
		return this.id;
	}

	public String getPath() {
		return this.path;
	}

	public String getTitre() {
		return this.titre;
	}

	public String getArtiste() {
		return this.artiste;
	}
	
	public Utilisateur getOwner(){
		return owner;
	}

}
