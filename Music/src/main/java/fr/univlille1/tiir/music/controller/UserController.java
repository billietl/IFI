package fr.univlille1.tiir.music.controller;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import fr.univlille1.tiir.music.dao.JPAConf;
import fr.univlille1.tiir.music.dao.repository.UtilisateurRepository;
import fr.univlille1.tiir.music.dao.entities.Utilisateur;

@Controller
public class UserController {


    @RequestMapping("/user")
    public @ResponseBody Utilisateur utilisateur(
            @RequestParam(value="id", required=true, defaultValue="0") Long id) {
    	AbstractApplicationContext context = new AnnotationConfigApplicationContext(JPAConf.class);
		UtilisateurRepository repository = context.getBean(UtilisateurRepository.class);
		Utilisateur user = repository.findOne(id);
		context.close();
		
		return user;
		}
}