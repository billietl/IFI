package fr.univlille1.tiir.music.dao.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the utilisateur database table.
 * 
 */
@Entity
@NamedQuery(name="Utilisateur.findAll", query="SELECT u FROM Utilisateur u")
public class Utilisateur implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="utilisateur_id")
	private Long utilisateurId;

	private String email;

	private String password;

	private String pseudo;

	public Utilisateur() {}
	
	public Utilisateur(String pseudo, String email, String passwd){
		this.email = email;
		this.pseudo = pseudo;
		this.password = passwd;
	}

	public Long getUtilisateurId() {
		return this.utilisateurId;
	}

	public void setUtilisateurId(Long utilisateurId) {
		this.utilisateurId = utilisateurId;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPseudo() {
		return this.pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}
	
	public String toString(){
		return "Utilisateur : "+this.pseudo;
	}

}