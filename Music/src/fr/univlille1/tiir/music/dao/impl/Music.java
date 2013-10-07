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
	private long music_id;
	private String path;
	private String titre;
	private String artiste;
	
	public long getId() {
		return this.music_id;
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

}
