package fr.univlille1.tiir.music.devtest;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import fr.univlille1.tiir.music.dao.JPAConf;
import fr.univlille1.tiir.music.dao.entities.Utilisateur;
import fr.univlille1.tiir.music.dao.repository.UtilisateurRepository;


public class DevTestUtilisateurJPA {

	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(JPAConf.class);
		UtilisateurRepository repository = context.getBean(UtilisateurRepository.class);
		System.out.println("C'est bon ici!");

		// save a couple of Utilisateurs
		Utilisateur user = new Utilisateur("Louis", "louis.billiet@etudiant.univ-lille1.fr", "test");
		repository.save(new Utilisateur("hello", "hello@world.com", "maman"));
		repository.save(new Utilisateur("hello bis", "hello.bis@world.com", "papa"));
		repository.save(new Utilisateur("Robert", "robert@gayzou.org", "j'aime la viande"));
		repository.save(user);

		// fetch all Utilisateurs
		List<Utilisateur> Utilisateurs = repository.findAll();
		System.out.println("Utilisateurs found with findAll():");
		System.out.println("-------------------------------");
		for (Utilisateur Utilisateur : Utilisateurs) {
			System.out.println(Utilisateur);
		}
		System.out.println();

		// fetch an individual Utilisateur by ID
		Utilisateur Utilisateur = repository.findOne(user.getUtilisateurId());
		System.out.println("Utilisateur found with findOne("+user.getUtilisateurId()+"):");
		System.out.println("--------------------------------");
		System.out.println(Utilisateur);
		System.out.println();

		// fetch Utilisateurs by last name
		List<Utilisateur> bauers = repository.findByPseudo("Robert");
		System.out.println("Utilisateur found with findByPseudo('Robert'):");
		System.out.println("--------------------------------------------");
		for (Utilisateur bauer : bauers) {
			System.out.println(bauer);
		}

		context.close();
	}
}
