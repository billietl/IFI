package fr.univlille1.tiir.music.dao.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.univlille1.tiir.music.dao.entities.Note;

public interface NoteRepository extends JpaRepository<Note, Long> {
	List<Note> findByMusique(long musique_id);
}
