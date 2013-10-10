package fr.univlille1.tiir.music.dao.entities;

import java.io.Serializable;

import javax.persistence.*;


/**
 * The persistent class for the note database table.
 * 
 */
@Entity
@NamedQuery(name="Note.findAll", query="SELECT n FROM Note n")
public class Note implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="note_id")
	private Long noteId;

	private Integer valeur;

	//bi-directional many-to-one association to Musique
	@ManyToOne
	@JoinColumn(name="musique_concernee")
	private Musique musique;

	public Note() {
	}

	public Long getNoteId() {
		return this.noteId;
	}

	public void setNoteId(Long noteId) {
		this.noteId = noteId;
	}

	public Integer getValeur() {
		return this.valeur;
	}

	public void setValeur(Integer valeur) {
		this.valeur = valeur;
	}

	public Musique getMusique() {
		return this.musique;
	}

	public void setMusique(Musique musique) {
		this.musique = musique;
	}

}