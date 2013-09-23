package fr.univlille1.tiir.music.dao.impl;

import java.io.File;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MusicDAO implements fr.univlille1.tiir.music.dao.Music{

	private static final long serialVersionUID = 1L;

	// Persistent Fields:
	@Id
	private File path;
	private String titre;
	private String artiste;

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

	public File getPath() {
		return this.path;
	}

	public String getTitre() {
		return this.titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getArtiste() {
		return this.artiste;
	}

	public void setArtiste(String artiste) {
		this.artiste = artiste;
	}

}
