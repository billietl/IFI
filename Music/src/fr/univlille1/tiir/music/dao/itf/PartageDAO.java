package fr.univlille1.tiir.music.dao.itf;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.univlille1.tiir.music.dao.entities.*;

public interface PartageDAO extends JpaRepository<Partage, Long> {
	// retourne toutes les personnes ayant acces a cette musique
	public List<Utilisateur> findByMusique(final Long musique_id);
	// retourne toutes les musiques que j'ai partagé avec cette personne
	public List<Musique> findByUtilisateur(final Long utilisateur_id);
}
