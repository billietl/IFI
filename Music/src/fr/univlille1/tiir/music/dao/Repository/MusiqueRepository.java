package fr.univlille1.tiir.music.dao.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.univlille1.tiir.music.dao.entities.Musique;

public interface MusiqueRepository extends JpaRepository<Musique, Long> {
	List<Musique> findByArtiste(String artiste);
}
