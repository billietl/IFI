package fr.univlille1.tiir.music.dao.impl;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

import fr.univlille1.tiir.music.dao.*;

@Entity
public class UserDAO implements fr.univlille1.tiir.music.dao.User{

	private static final long serialVersionUID = 1L;

	// Persistent Fields:
	@Id
	private String pseudo;
	private String passwd;
	private List<Music> bibliothèque; // relation avec Music (Own)

	// Constructors:
	public UserDAO() {
	}

	public UserDAO(String pseudo, String passwd) {
		this.pseudo = pseudo;
		this.passwd = passwd;
	}

	// String Representation:
	@Override
	public String toString() {
		return "Utilisateur : " + pseudo;
	}

	public String getNickName() {
		return this.pseudo;
	}

	public String getPasswd() {
		return this.passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	
	public List<Music> getLibrary(){
		return this.bibliothèque;
	}
}
