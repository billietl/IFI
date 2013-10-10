package fr.univlille1.tiir.music.devtest;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import fr.univlille1.tiir.music.dao.JPAConf;
import fr.univlille1.tiir.music.dao.Repository.UtilisateurRepository;
import fr.univlille1.tiir.music.dao.entities.Utilisateur;


public class DevTestUtilisateurJPA {

	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(JPAConf.class);
		UtilisateurRepository repository = context.getBean(UtilisateurRepository.class);
		System.out.println("C'est bon ici!");

		// save a couple of Utilisateurs
		repository.save(new Utilisateur("hello@world.com", "maman", "hello"));
		repository.save(new Utilisateur("hello.bis@world.com", "papa", "hello bis"));
		repository.save(new Utilisateur("robert@gayzou.org", "j'aime la bite", "Robert"));
		repository.save(new Utilisateur("louis.billiet@etudiant.univ-lille1.fr", "test", "Louis"));

		// fetch all Utilisateurs
		List<Utilisateur> Utilisateurs = repository.findAll();
		System.out.println("Utilisateurs found with findAll():");
		System.out.println("-------------------------------");
		for (Utilisateur Utilisateur : Utilisateurs) {
			System.out.println(Utilisateur);
		}
		System.out.println();

		// fetch an individual Utilisateur by ID
		Utilisateur Utilisateur = repository.findOne(1L);
		System.out.println("Utilisateur found with findOne(1L):");
		System.out.println("--------------------------------");
		System.out.println(Utilisateur);
		System.out.println();

		// fetch Utilisateurs by last name
		List<Utilisateur> bauers = repository.findByPseudo("Bauer");
		System.out.println("Utilisateur found with findByLastName('Bauer'):");
		System.out.println("--------------------------------------------");
		for (Utilisateur bauer : bauers) {
			System.out.println(bauer);
		}

		context.close();
	}
}
