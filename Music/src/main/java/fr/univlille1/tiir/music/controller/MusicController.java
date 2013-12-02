package fr.univlille1.tiir.music.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MusicController {
	
	@RequestMapping("/listMusic")
	public ModelAndView listMusic(){
		String m = "Test !!!";
		return new ModelAndView("musicList", "message", m);
	}
}
