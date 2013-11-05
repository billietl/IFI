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

	//bi-directional many-to-one association to Note
	@OneToMany(mappedBy="musique")
	private List<Note> notes;

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
	
	public Note getNoteMoyenne(){
		List<Note> noteL = this.getNotes();
		Integer sum = new Integer(0);
		for(Note n : noteL){
			sum += n.getValeur();
		}
		Float total = new Float(sum)/new Float(noteL.length);
		Note result = new Note();
		result.setValeur(Math.round(total));
		result.setNoteId(-1);
		result.setMusique(this);
		return result;
	}

	public List<Note> getNotes() {
		return this.notes;
	}

	public void setNotes(List<Note> notes) {
		this.notes = notes;
	}

	public Note addNote(Note note) {
		getNotes().add(note);
		note.setMusique(this);

		return note;
	}

	public Note removeNote(Note note) {
		getNotes().remove(note);
		note.setMusique(null);

		return note;
	}

}