package fr.univlille1.tiir.music.dao.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the partage database table.
 * 
 */
@Entity
@NamedQuery(name="Partage.findAll", query="SELECT p FROM Partage p")
public class Partage implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="partage_id")
	private Long partageId;

	@Column(name="utilisateur_id")
	private Long utilisateurId;

	//bi-directional many-to-one association to Musique
	@ManyToOne
	@JoinColumn(name="musique_id")
	private Musique musique;

	//bi-directional many-to-one association to Utilisateur
	@ManyToOne
	@JoinColumn(name="musique_id")
	private Utilisateur utilisateur;

	public Partage() {
	}

	public Long getPartageId() {
		return this.partageId;
	}

	public void setPartageId(Long partageId) {
		this.partageId = partageId;
	}

	public Long getUtilisateurId() {
		return this.utilisateurId;
	}

	public void setUtilisateurId(Long utilisateurId) {
		this.utilisateurId = utilisateurId;
	}

	public Musique getMusique() {
		return this.musique;
	}

	public void setMusique(Musique musique) {
		this.musique = musique;
	}

	public Utilisateur getUtilisateur() {
		return this.utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

}