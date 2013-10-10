package fr.univlille1.tiir.music.dao.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.univlille1.tiir.music.dao.entities.Utilisateur;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {
	List<Utilisateur> findByPseudo(String pseudo);
}
