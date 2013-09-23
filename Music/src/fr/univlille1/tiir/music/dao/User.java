package fr.univlille1.tiir.music.dao;

import java.io.Serializable;
import java.util.List;

public interface User extends Serializable {
	
	public String getNickName();
	public String getPasswd();
	public void setPasswd(String passwd);
	public List<Music> getLibrary();
	public String toString();
	
}
