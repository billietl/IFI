package fr.univlille1.tiir.music.dao.impl;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Music implements fr.univlille1.tiir.music.dao.Music {

	@Id
	private long id;
	private String path;
	private String titre;
	private String artiste;
	
	@Override
	public long getId() {
		return this.id;
	}

	@Override
	public String getPath() {
		return this.path;
	}

	@Override
	public String getTitre() {
		return this.titre;
	}

	@Override
	public String getArtiste() {
		return this.artiste;
	}

}
