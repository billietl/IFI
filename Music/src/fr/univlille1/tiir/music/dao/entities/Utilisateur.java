package fr.univlille1.tiir.music.dao.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the utilisateur database table.
 * 
 */
@Entity
@NamedQuery(name="Utilisateur.findAll", query="SELECT u FROM Utilisateur u")
public class Utilisateur implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="utilisateur_id")
	private Long utilisateurId;

	private String email;

	private String password;

	private String pseudo;

	//bi-directional many-to-one association to Musique
	@OneToMany(mappedBy="utilisateur")
	private List<Musique> musiques;

	//bi-directional many-to-one association to Partage
	@OneToMany(mappedBy="utilisateur")
	private List<Partage> partages;

	public Utilisateur() {
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

	public List<Musique> getMusiques() {
		return this.musiques;
	}

	public void setMusiques(List<Musique> musiques) {
		this.musiques = musiques;
	}

	public Musique addMusique(Musique musique) {
		getMusiques().add(musique);
		musique.setUtilisateur(this);

		return musique;
	}

	public Musique removeMusique(Musique musique) {
		getMusiques().remove(musique);
		musique.setUtilisateur(null);

		return musique;
	}

	public List<Partage> getPartages() {
		return this.partages;
	}

	public void setPartages(List<Partage> partages) {
		this.partages = partages;
	}

	public Partage addPartages(Partage partages) {
		getPartages().add(partages);
		partages.setUtilisateur(this);

		return partages;
	}

	public Partage removePartages(Partage partages) {
		getPartages().remove(partages);
		partages.setUtilisateur(null);

		return partages;
	}

}