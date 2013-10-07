package fr.univlille1.tiir.music.dao.itf;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.univlille1.tiir.music.dao.entities.*;

public interface MusiqueDAO extends JpaRepository<Musique,Long> {
	public List<Musique> findByArtiste(final String name);
}
