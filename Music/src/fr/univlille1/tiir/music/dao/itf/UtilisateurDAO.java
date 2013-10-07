package fr.univlille1.tiir.music.dao.itf;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.univlille1.tiir.music.dao.entities.*;

public interface UtilisateurDAO extends JpaRepository<Utilisateur, Long> {

}
