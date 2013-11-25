package fr.univlille1.tiir.music.dto;

public class Musique {

	private String artiste;
	private String titre;
	private long id;
	private int moyenne;
	
	public Musique(){}
	
	public Musique(fr.univlille1.tiir.music.dao.entities.Musique m){
		this.artiste = m.getArtiste();
		this.titre = m.getTitre();
		this.id = m.getMusiqueId();
		this.moyenne = m.getNoteMoyenne().getValeur();
	}
	public String getArtiste() {
		return artiste;
	}
	public String getTitre() {
		return titre;
	}
	public long getId() {
		return id;
	}
	public int getMoyenne() {
		return moyenne;
	}
}
