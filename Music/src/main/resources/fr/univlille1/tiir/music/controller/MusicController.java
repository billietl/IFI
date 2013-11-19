package fr.univlille1.tiir.music.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.univlille1.tiir.music.dao.entities.Musique;

@Controller
public class MusicController {
	
	@RequestMapping("/action/listMusic")
	public String listMusic(Model model){
		ArrayList<Musique> l = new ArrayList<Musique>(10);
		Musique m = new Musique();
		m.setArtiste(artiste);
		m.setMusiqueId(musiqueId);
		m.setNotes(notes);
		m.setTitre(titre);
		l.add(m);
		model.addAttribute("musicList", null);
		return "";
	}
}
