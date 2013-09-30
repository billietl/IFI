package fr.univlille1.tiir.music.dao.impl;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="music")
public class Music implements fr.univlille1.tiir.music.dao.Music {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
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
