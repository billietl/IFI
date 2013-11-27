package fr.univlille1.tiir.music.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.univlille1.tiir.music.dao.JPAConf;
import fr.univlille1.tiir.music.dao.entities.Musique;
import fr.univlille1.tiir.music.dao.repository.MusiqueRepository;

@Controller
public class MusicController {
	
	@RequestMapping("/action/listMusic")
	public String listMusic(Model model){
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(JPAConf.class);
		MusiqueRepository repository = context.getBean(MusiqueRepository.class);
		
		List<fr.univlille1.tiir.music.dto.Musique> l = new ArrayList<fr.univlille1.tiir.music.dto.Musique>(); 
		
		for(Musique m : repository.findAll()){
			l.add(new fr.univlille1.tiir.music.dto.Musique(m));
		}
		
		model.addAttribute("musicList", l);
		context.close();
		
		return "";
	}
}
