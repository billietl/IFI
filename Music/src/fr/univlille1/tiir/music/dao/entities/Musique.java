package fr.univlille1.tiir.music.dao.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the musique database table.
 * 
 */
@Entity
@NamedQuery(name="Musique.findAll", query="SELECT m FROM Musique m")
public class Musique implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="musique_id")
	private Long musiqueId;

	private String artiste;

	private byte[] data;

	private String titre;

	//bi-directional many-to-one association to Utilisateur
	@ManyToOne
	@JoinColumn(name="proprietaire")
	private Utilisateur utilisateur;

	//bi-directional many-to-one association to Partage
	@OneToMany(mappedBy="musique")
	private List<Partage> partages;

	public Musique() {
	}

	public Long getMusiqueId() {
		return this.musiqueId;
	}

	public void setMusiqueId(Long musiqueId) {
		this.musiqueId = musiqueId;
	}

	public String getArtiste() {
		return this.artiste;
	}

	public void setArtiste(String artiste) {
		this.artiste = artiste;
	}

	public byte[] getData() {
		return this.data;
	}

	public void setData(byte[] data) {
		this.data = data;
	}

	public String getTitre() {
		return this.titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public Utilisateur getUtilisateur() {
		return this.utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public List<Partage> getPartages() {
		return this.partages;
	}

	public void setPartages(List<Partage> partages) {
		this.partages = partages;
	}

	public Partage addPartage(Partage partage) {
		getPartages().add(partage);
		partage.setMusique(this);

		return partage;
	}

	public Partage removePartage(Partage partage) {
		getPartages().remove(partage);
		partage.setMusique(null);

		return partage;
	}

}