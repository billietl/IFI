package fr.univlille1.tiir.music.dao;

import java.io.File;
import java.io.Serializable;

public interface Music extends Serializable {

	public File getPath();
	public String getTitre();
	public void setTitre(String titre);
	public String getArtiste();
	public void setArtiste(String artiste);
	public String toString();
	
}
